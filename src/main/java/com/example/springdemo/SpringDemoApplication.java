package com.example.springdemo;

import com.example.springdemo.service.ShapeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
//        Shape shape = (Shape) context.getBean("circle");
        var shape = context.getBean("shapeService", ShapeService.class);

//        shape.draw();
        System.out.println(shape.getCircle().getCenter().getX());
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
