package com.example.dependancycheck;

import org.springframework.boot.SpringApplication;

public class TestDependancyCheckApplication {

    public static void main(String[] args) {
        SpringApplication.from(DependancyCheckApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
