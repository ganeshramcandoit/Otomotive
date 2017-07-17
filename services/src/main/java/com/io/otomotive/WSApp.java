package com.io.otomotive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.io.otomotive")
public class WSApp {
 
    public static void main(String[] args) {
	SpringApplication.run(WSApp.class, args);
    }
}
