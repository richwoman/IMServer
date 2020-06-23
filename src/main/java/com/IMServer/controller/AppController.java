package com.IMServer.controller;

import com.IMServer.model.PostApp;
import com.IMServer.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {
    @Autowired
    AppService appService;

    @PostMapping(path="/apps")
    public ResponseEntity create(@RequestBody PostApp app) {
        if (appService.create(app.getAppId(), app.getAppKey())) {
            return new ResponseEntity(HttpStatus.OK);
        };
        return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
    }
}
