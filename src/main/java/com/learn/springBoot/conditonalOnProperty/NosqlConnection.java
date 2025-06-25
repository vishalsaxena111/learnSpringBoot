package com.learn.springBoot.conditonalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "NosqlConnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NosqlConnection {

    NosqlConnection(){
        System.out.println("Nosql bean initialized");
    }
}
