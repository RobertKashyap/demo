package com.example.demo.student;

import static java.time.Month.*;

import java.time.LocalDate;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student robert = new Student(
                    "Robert",
                    "orionalchemist@gmail.com",
                    LocalDate.of(1999, JUNE, 24));

            Student anshu = new Student(
                    "Anshu",
                    "ageetanjali308@gmail.com",
                    LocalDate.of(2003, AUGUST, 30));

            repository.saveAll(List.of(robert, anshu));
        };

    }
}
