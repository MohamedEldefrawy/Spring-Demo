package com.example.springdemo;

public class Triangle {
    private String type;
    private int height;

    public Triangle(int height, Point a, Point b, Point c) {
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Point a;
    private Point b;
    private Point c;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
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
        System.out.println("A Points X = " + this.a.getX());
        System.out.println("A Points Y = " + this.a.getY());
        System.out.println("B Points X = " + this.b.getX());
        System.out.println("B Points Y = " + this.b.getY());
        System.out.println("C Points X = " + this.c.getX());
        System.out.println("C Points Y = " + this.c.getY());

    }

    public Triangle(int height) {
        this.height = height;
    }
}
