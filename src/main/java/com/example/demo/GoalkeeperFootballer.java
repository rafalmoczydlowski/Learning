package com.example.demo;

import annotations.Goalkeeper;
import org.springframework.stereotype.Component;

@Component
@Goalkeeper
public class GoalkeeperFootballer implements Footballer {
    private String name;
    private String surname;
    private int age;

    public GoalkeeperFootballer() { }

    public GoalkeeperFootballer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void getPlayerPosition() {
        System.out.println("I'm playing as goalkeeper");
    }

    @Override
    public void introduceThePlayer() {
        System.out.println("The player's name is: " + name + " " + surname + ". He is " + age + " years old.");
    }
}
