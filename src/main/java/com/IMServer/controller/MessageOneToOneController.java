package com.IMServer.controller;

import com.IMServer.accessingdatamysql.App;
import com.IMServer.dao.AppRepository;
import com.IMServer.model.MessageOneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/messages")
public class MessageOneToOneController {
    @Autowired
    private AppRepository appRepository;

    @PostMapping
    public ResponseEntity create(@RequestBody MessageOneToOne resource) {
        String appId = resource.getAppId();
        Optional<App> app = appRepository.findById(appId);
        System.out.println(app.isPresent());
        if (!app.isPresent()) {
            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
