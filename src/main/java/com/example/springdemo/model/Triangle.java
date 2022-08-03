package com.example.springdemo.model;

import com.example.springdemo.contract.Shape;

public class Triangle implements Shape {
    private String type;
    private int height;
    private Point[] points;


    public Triangle(int height, Point[] points) {
        this.height = height;
        this.points = points;

    }


    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(int height) {
        this.height = height;
    }


    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println(this.type + " " + "Drawing Triangle...");
        System.out.println("Height = " + this.height);

        for (var point :
                this.points) {
            System.out.println("A Points X = " + point.getX());
            System.out.println("A Points Y = " + point.getY());
        }
    }

    public void myInit() {
        System.out.println("Initialize bean hook has been called from Triangle");
    }
}
