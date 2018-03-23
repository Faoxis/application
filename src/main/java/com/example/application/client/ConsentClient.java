package com.example.application.client;

import com.example.application.domain.Application;
import org.springframework.stereotype.Repository;

@Repository
public class ConsentClient {

    public void get(Application application) {
        System.out.println("Application " + application.getId() + " has been sent to consent!");
    }

}
