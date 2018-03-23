package com.example.application.observer;

import com.example.application.domain.Application;
import com.example.application.service.applciation.ApplicationService;
import com.example.application.subject.ApplicationSubject;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsentObserver implements Observer {

    private ApplicationSubject applicationSubject;

    @Autowired
    public ConsentObserver(ApplicationSubject applicationSubject) {
        applicationSubject.registerObserver(this);
    }

    @Override
    public Application update(Application application) {
        return null;
    }
}
