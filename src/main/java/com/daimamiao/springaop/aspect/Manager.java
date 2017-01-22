package com.daimamiao.springaop.aspect;

import org.aspectj.lang.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xcc on 1/22/2017.
 */
@Aspect
public class Manager {

    private Map<String, Integer> instrumentCounts = new HashMap<String, Integer>();

    @After("execution(* com.daimamiao.springaop.app.Concert.perform(String)) && args(instrument)")
    public void countInstrument(String instrument) {
        int currentCount = getInstrumentCount(instrument);
        instrumentCounts.put(instrument, currentCount + 1);
        System.out.println(instrumentCounts.get(instrument));
    }

    public int getInstrumentCount(String instrument) {
        return instrumentCounts.containsKey(instrument) ? instrumentCounts.get(instrument) : 0;
    }
}
