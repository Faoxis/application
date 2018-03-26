package com.example.application.controller;

import com.example.application.domain.Application;
import com.example.application.service.applciation.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ApplicationController {

    private ApplicationService applicationService;

    @PostMapping("/applications")
    public Application save(@RequestBody Application application) {
        return applicationService.handle(application);
    }

}
