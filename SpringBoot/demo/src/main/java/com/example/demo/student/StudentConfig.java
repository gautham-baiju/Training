package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student ashwin = new Student(
                    "Ashwin",
                    "ashwin2002@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 4));
            Student josna = new Student(
                    "Josna",
                    "josnamathu@gmail.com",
                    LocalDate.of(2003, Month.JULY, 10));
            repository.saveAll(List.of(ashwin, josna));
        };
    }
}
