package com.example.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.configuration.FooBarConfigurationTest.MockApplication;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = MockApplication.class)
public class FooBarConfigurationTest {

    @Test
    void shouldLoadProperty() {
        assertThat(System.getProperty("foo"))
                .isEqualTo("bar");
    }

    @SpringBootApplication
    public static class MockApplication {

        public static void main(String[] args) {
        }
    }
}
