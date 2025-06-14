package com.learn.springBoot.DependencyInjection.Setter;

import com.learn.springBoot.DependencyInjection.Field.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSetter {

    private OrderSetter orderSetter;

    @Autowired
    public void setOrderSetter(OrderSetter order){
        this.orderSetter = order;
    }


    UserSetter(){
        System.out.println("inside usersetter constructor");
    }

}
