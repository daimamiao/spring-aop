package com.daimamiao.springaop.app;

/**
 * Created by xcc on 1/22/2017.
 */
public class Concert implements Performance {
    @Override
    public void perform(String instrument) {
        System.out.println("performing the " + instrument + " concert");
    }
}
