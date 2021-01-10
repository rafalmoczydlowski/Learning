package com.example.demo;

import annotations.Defender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Defender
public class DefenderFootballer implements Footballer{
    private String name;
    private String surname;

    public DefenderFootballer(){ }

    public DefenderFootballer(@Value("#{systemProperties['defender.name']}") String name,
                              @Value("#{systemProperties['defender.surname']}") String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void getPlayerPosition() {
        System.out.println("I'm playing as defender");
    }

    @Override
    public void introduceThePlayer() {
        System.out.println("The player's name is: " + name + " " + surname);
    }
}
