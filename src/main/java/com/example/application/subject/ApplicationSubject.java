package com.example.application.subject;

import com.example.application.observer.Observer;

public interface ApplicationSubject {
    void registerObserver(Observer o);

}
