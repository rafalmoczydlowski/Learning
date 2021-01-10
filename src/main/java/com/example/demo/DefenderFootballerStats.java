package com.example.demo;

import annotations.Defender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefenderFootballerStats implements FootballerStats {
    private Footballer footballer;

    @Autowired
    @Defender
    public DefenderFootballerStats(Footballer footballer) {
        this.footballer = footballer;
    }

    @Autowired
    @Defender
    public void setFootballer(Footballer footballer) {
        this.footballer = footballer;
    }

    public void getPosition() {
        footballer.getPlayerPosition();
    }
}
