package com.example.springdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution( public int getX())")
    public void loggingAdvice() {
        System.out.println("Advice run. Get method called");
    }
}
