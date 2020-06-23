package com.IMServer.accessingdatamysql;

import javax.persistence.*;
import java.util.Date;

@Table(name = "app")
@Entity
public class App {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String appid;

    private String appkey;

    private Date created_at;

    public App(String _appid, String _appkey) {
        appid = _appid;
        appkey = _appkey;
        created_at = new Date();
    }

    public void setAppid(String _appid) {
        appid = _appid;
    }

    public void setAppKey(String _appkey) {
        appkey = _appkey;
    }
}
