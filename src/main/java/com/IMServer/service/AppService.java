package com.IMServer.service;

import com.IMServer.accessingdatamysql.App;
import com.IMServer.dao.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    private AppRepository appRepository;

    public boolean create(String appId, String appKey) {
        try {
            App newApp = new App(appId, appKey);
            appRepository.save(newApp);
            return true;
        } catch(Exception exception) {
            return false;
        }
    }
}
