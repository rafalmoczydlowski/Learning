package com.example.demo;

import static org.junit.Assert.*;
import config.MatchCounterConfig;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MatchCounterConfig.class)
public class MatchCounterConfigTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private Footballer footballer;

    @Autowired
    private MatchCounter matchCounter;

    @Test
    public void footballerShouldNotBeNull() {
        assertNotNull(footballer);
    }

    @Test
    public void testMatchCounter() {

        footballer.playMatch(0);
        footballer.playMatch(0);
        footballer.playMatch(0);
        footballer.playMatch(2);
        footballer.playMatch(2);
        footballer.playMatch(2);
        footballer.playMatch(4);


        assertEquals(3, matchCounter.getPlayCount(0));
        assertEquals(0, matchCounter.getPlayCount(1));
        assertEquals(3, matchCounter.getPlayCount(2));
        assertEquals(0, matchCounter.getPlayCount(3));
        assertEquals(1, matchCounter.getPlayCount(4));
    }

    @Test
    public void testOpponents() {
        DefenderFootballer df = new DefenderFootballer();
        List<String> laLigaOpponents = new ArrayList<>();
        log.clearLog();
        laLigaOpponents.add("Real Madryt");
        laLigaOpponents.add("Atletico Madryt");
        df.play(laLigaOpponents);
        Assert.assertEquals("I'm compete with Real Madryt\nI'm compete with Atletico Madryt", log.getLogWithNormalizedLineSeparator().trim());
    }
}
