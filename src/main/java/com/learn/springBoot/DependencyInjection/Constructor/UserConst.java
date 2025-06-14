package com.learn.springBoot.DependencyInjection.Constructor;

import org.springframework.stereotype.Component;

@Component
public class UserConst {

    private OrderConst orderConst;


    UserConst(OrderConst order){
        System.out.println("inside usersetter constructor");
        this.orderConst = order;
    }

}
