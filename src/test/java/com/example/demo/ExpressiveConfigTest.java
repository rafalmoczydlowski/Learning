package com.example.demo;

import annotations.Defender;
import config.ExpressiveConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveConfigTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private FootballerStats footballerStats;

    @Autowired
    @Defender
    private Footballer footballer;

    @Autowired
    Environment env;

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
    public void defenderFootballer(){
        DefenderFootballer defenderFootballer = new DefenderFootballer(env.getProperty("defender.name"), env.getProperty("defender.surname"));
        log.clearLog();
        defenderFootballer.introduceThePlayer();
        Assert.assertEquals("The player's name is: Gerard Pique", log.getLogWithNormalizedLineSeparator().trim());
    }
}
