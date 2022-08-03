package com.example.springdemo.service;

import com.example.springdemo.model.Circle;
import com.example.springdemo.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;


    public Circle getCircle() {
        return circle;
    }

    @Autowired
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    @Autowired
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
