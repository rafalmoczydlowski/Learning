package com.example.demo;

import config.FootballerConfig;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FootballerConfig.class)
public class FootballerConfigTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private FootballerStats footballerStats;

    @Autowired
    private Footballer footballer;


    @Test
    public void footballerShouldNotBeNull() {
        assertNotNull(footballer);
    }

    @Test
    public void getPosition() {
        log.clearLog();
        footballerStats.getPosition();
        Assert.assertEquals("I'm playing as defender\n", log.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void getName() {
        DefenderFootballer defenderFootballer = new DefenderFootballer("Rafał", "Moczydłowski");
        log.clearLog();
        defenderFootballer.introduceThePlayer();
        Assert.assertEquals("The player's name is: Rafał Moczydłowski", log.getLogWithNormalizedLineSeparator().trim());
    }
}
