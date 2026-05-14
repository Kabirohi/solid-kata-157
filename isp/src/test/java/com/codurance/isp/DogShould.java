package com.codurance.isp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class DogShould {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    private final Dog dog = new Dog();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(consoleContent));
    }

    @Test
    void run_as_a_running_capable_animal() {
        // Enforces that Dog strictly implements the Running interface
        Running runningDog = dog; 
        runningDog.run();
        
        assertThat(consoleContent.toString())
                .isEqualTo("Dog is running");
    }

    @Test
    void bark_as_a_barking_capable_animal() {
        // Enforces that Dog strictly implements the Barking interface
        Barking barkingDog = dog; 
        barkingDog.bark();
        
        assertThat(consoleContent.toString())
                .isEqualTo("Dog is barking");
    }
}
