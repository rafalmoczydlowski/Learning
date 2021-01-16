package com.example.demo;

import org.aspectj.lang.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class MatchCounter {

    private Map<Integer, Integer> matchCounts = new HashMap<>();

    @Pointcut("execution(* com.example.demo.Footballer.playMatch(int))" + "&&args(matchNumber)")
    public void matchPlayed(int matchNumber) {}

    @Before("matchPlayed(matchNumber)")
    public void countMatch(int matchNumber) {
        int currentCount = getPlayCount(matchNumber);
        matchCounts.put(matchNumber, currentCount +1);
    }

    public int getPlayCount(int matchNumber) {
        return matchCounts.containsKey(matchNumber) ? matchCounts.get(matchNumber) : 0;
    }
}
