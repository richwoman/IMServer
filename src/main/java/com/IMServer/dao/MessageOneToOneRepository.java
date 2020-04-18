package com.IMServer.dao;

import com.IMServer.accessingdatamysql.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageOneToOneRepository extends JpaRepository<App, Integer> {
}
