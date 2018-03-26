package com.example.application.observer;

import com.example.application.service.consent.ConsentService;
import com.example.application.domain.Application;
import com.example.application.subject.ApplicationSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsentObserver implements Observer {

    private ConsentService consentService;

    @Autowired
    public ConsentObserver(ApplicationSubject applicationSubject, ConsentService consentService) {
        applicationSubject.registerObserver(this);
        this.consentService = consentService;
    }

    @Override
    public Application update(Application application) {
        if (isApplicationReady(application)) {
            consentService.get(application);
        }

        return application;
    }

    private boolean isApplicationReady(Application application) {
        return application != null
                && application.getFirstName() != null
                && application.getLastName() != null
                && application.getEmail() != null
                && application.getPhone() != null;
    }
}
