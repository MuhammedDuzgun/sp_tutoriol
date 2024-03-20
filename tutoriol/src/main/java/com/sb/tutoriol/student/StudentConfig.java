package com.sb.tutoriol.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
/*            Student mami = new Student
                    ("Muhammed", "mami@gmail.com", LocalDate.of(2000, Month.JANUARY, 18), 23);
            Student murat = new Student
                    ("Murat", "muro@gmail.com", LocalDate.of(2001, Month.FEBRUARY, 5), 22);

            repository.saveAll(List.of(mami, murat));*/
        };
    }



}
