package com.example.demo;

import annotations.Goalkeeper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Goalkeeper
public class GoalkeeperFootballer implements Footballer {
    private String name;
    private String surname;
    private int age;
    private List<String> matches;

    public GoalkeeperFootballer() { }

    public GoalkeeperFootballer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setMatches(List<String> matches) {
        this.matches = matches;
    }

    @Override
    public void getPlayerPosition() {
        System.out.println("I'm playing as goalkeeper");
    }

    @Override
    public void introduceThePlayer() {
        System.out.println("The player's name is: " + name + " " + surname + ". He is " + age + " years old.");
    }

    @Override
    public void play(List<String> matches) {
        for(String opponent : matches)
            System.out.println("I compete with " + opponent);
    }

    @Override
    public void playMatch(int number) {
        System.out.println("-Opponent: " + matches.get(number));
    }
}
