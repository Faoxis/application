package com.example.application.service.applciation;

import com.example.application.domain.Application;
import com.example.application.reposiotry.ApplicationRepository;
import com.example.application.observer.Observer;
import com.example.application.subject.ApplicationSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService, ApplicationSubject {

    private final List<Observer> observers;
    private ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }


    @Override
    public Application handle(Application application) {
        Application handledApplication;
        for (Observer observer : observers) {
            handledApplication = observer.update(application);
        }

        return applicationRepository.save(application);
    }
}
