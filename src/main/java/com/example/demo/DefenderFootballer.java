package com.example.demo;

import annotations.Defender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Defender
public class DefenderFootballer implements Footballer{
    private String name;
    private String surname;
    private List<String> matches;

    public DefenderFootballer(){ }

    public DefenderFootballer(@Value("#{systemProperties['defender.name']}") String name,
                              @Value("#{systemProperties['defender.surname']}") String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMatches(List<String> matches) {
        this.matches = matches;
    }

    @Override
    public void getPlayerPosition() {
        System.out.println("I'm playing as defender");
    }

    @Override
    public void introduceThePlayer() {
        System.out.println("The player's name is: " + name + " " + surname);
    }

    @Override
    public void play(List<String> matches) {
        for(String opponent : matches)
            System.out.println("I'm compete with " + opponent);
    }

    @Override
    public void playMatch(int number) {
        System.out.println("-Opponent: " + matches.get(number));
    }
}
