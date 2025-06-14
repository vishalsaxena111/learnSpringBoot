package com.learn.springBoot.DependencyInjection.Field;

import org.springframework.stereotype.Component;

@Component
public class Order {

    Order(){
        System.out.println("inside Order constructor");
    }
}
