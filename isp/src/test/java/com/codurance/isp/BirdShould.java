package com.codurance.isp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class BirdShould {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    private final Bird bird = new Bird();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(consoleContent));
    }

    @Test
    void run_as_a_running_capable_animal() {
        // Enforces that Bird strictly implements the Running interface
        Running runningBird = bird; 
        runningBird.run();
        
        assertThat(consoleContent.toString())
                .isEqualTo("Bird is running");
    }

    @Test
    void fly_as_a_flying_capable_animal() {
        // Enforces that Bird strictly implements the Flying interface
        Flying flyingBird = bird; 
        flyingBird.fly();
        
        assertThat(consoleContent.toString())
                .isEqualTo("Bird is flying");
    }
}
