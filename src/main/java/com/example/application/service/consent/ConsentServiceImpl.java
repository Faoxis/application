package com.example.application.service.consent;

import com.example.application.domain.Application;
import org.springframework.stereotype.Service;

@Service
public class ConsentServiceImpl implements ConsentService {

    // ConsentClient dependency could be injected here

    @Override
    public void get(Application application) {
        System.out.println("Application for "
                + application.getFirstName() + " " + application.getLastName()
                + " has been sent to consent!");
    }

}
