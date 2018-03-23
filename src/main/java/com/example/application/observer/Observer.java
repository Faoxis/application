package com.example.application.observer;

import com.example.application.domain.Application;

public interface Observer {
    Application update(Application application);
}