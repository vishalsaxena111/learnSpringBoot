package com.learn.springBoot.conditonalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

@Component
public class DBConnection {

    @Autowired(required = false)
    MysqlConnection mysqlConnection;

    @Autowired(required = false)
    NosqlConnection nosqlConnection;


    DBConnection(){
        System.out.println("DB Connection initialized");

    }

    @PostConstruct
    public void init(){
        System.out.println("after DB connection");
        System.out.println("Mysql connection " + Objects.isNull(mysqlConnection));
        System.out.println("Nosql connection " + Objects.isNull(nosqlConnection));
    }

}
