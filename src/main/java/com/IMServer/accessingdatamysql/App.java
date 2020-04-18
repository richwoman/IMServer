package com.IMServer.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "appTest")
@Entity
public class App {
    @Id
    private String id;

    private String appName;

    public void setId(String id) {
        this.id = id;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
