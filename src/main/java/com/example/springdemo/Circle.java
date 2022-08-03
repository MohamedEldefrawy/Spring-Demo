package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    private Point center;

    public Circle(Point center) {
        this.center = center;
    }

    public Circle() {
    }

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("X = " + " " + this.center.getX());
        System.out.println("Y = " + " " + this.center.getY());
    }
}
