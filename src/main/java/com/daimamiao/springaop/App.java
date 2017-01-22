package com.daimamiao.springaop;

import com.daimamiao.springaop.app.Concert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-aop.xml");
        Concert concert = (Concert) applicationContext.getBean("concert");
        concert.perform("piano");
    }
}
