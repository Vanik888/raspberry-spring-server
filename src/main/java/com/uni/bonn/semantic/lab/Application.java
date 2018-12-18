package com.uni.bonn.semantic.lab;

import com.uni.bonn.semantic.lab.raspberry.Raspberry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Raspberry raspberry = Raspberry.getInstance();
        SpringApplication.run(Application.class, args);
    }

}