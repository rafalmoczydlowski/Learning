package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DefenderFootballer implements Footballer{

    @Override
    public void getPlayerPosition() {
        System.out.println("I'm playing as defender");
    }
}
