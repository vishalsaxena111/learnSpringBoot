package com.learn.springBoot.conditonalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "MysqlConnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MysqlConnection {

    MysqlConnection(){
        System.out.println("Mysql bean initialized");
    }
}
