package com.learn.springBoot.DependencyInjection.Constructor;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderConst {

    OrderConst(){
        System.out.println("inside OrderConst constructor");
    }
}
