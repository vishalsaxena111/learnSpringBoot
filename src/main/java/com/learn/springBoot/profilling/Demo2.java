package com.learn.springBoot.profilling;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class Demo2 {

    @Value("${username}")
    private String usernam;

    @Value("${password}")
    private String password;


    @PostConstruct
    public void init(){
        System.out.println( "Demo 1 username " + usernam  +" password "+password);
    }
}
