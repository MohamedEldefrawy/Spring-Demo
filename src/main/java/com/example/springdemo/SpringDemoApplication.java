package com.example.springdemo;

import com.example.springdemo.dto.UserDetails;
import com.example.springdemo.service.ShapeService;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("spring.xml");
        Transaction transaction = null;

        var shape = context.getBean("shapeService", ShapeService.class);
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setName("Mohamed");

//        Create hibernate session factory


//        shape.draw();
        System.out.println(shape.getCircle().getCenter().getX());
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
