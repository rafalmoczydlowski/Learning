package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DefenderFootballer implements Footballer{
    private String name;
    private String surname;

    public DefenderFootballer(){ }

    public DefenderFootballer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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
