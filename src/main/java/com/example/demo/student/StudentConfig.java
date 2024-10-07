package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            StudentEntity mahyeza = new StudentEntity(
                    67347628,
                    "Mahyeza",
                    "Blok D4, No.34",
                    "XII RPL I"
            );

            repository.saveAll(
                    List.of(mahyeza)
            );
        };
    }
}
