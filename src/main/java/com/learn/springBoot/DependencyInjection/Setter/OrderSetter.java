package com.learn.springBoot.DependencyInjection.Setter;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderSetter {

    OrderSetter(){
        System.out.println("inside OrderSetter constructor");
    }
}
