package com.example.springdemo.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Point implements InitializingBean, DisposableBean {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method has been called from Point Object");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Dispose method has been called from Point Object");

    }
}
