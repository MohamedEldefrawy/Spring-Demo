package com.example.springdemo;

public class Circle implements Shape {

    private Point center;

    public Circle(Point center) {
        this.center = center;
    }


    public Point getCenter() {
        return center;
    }

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
