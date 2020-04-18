package com.IMServer.dao;

import com.IMServer.accessingdatamysql.App;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AppRepository extends CrudRepository<App, String> {
    @Override
    Optional<App> findById(String s);
}
