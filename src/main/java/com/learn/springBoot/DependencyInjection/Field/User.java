package com.learn.springBoot.DependencyInjection.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private Order order;

    User(){
        System.out.println("inside user constructor");
    }

}
