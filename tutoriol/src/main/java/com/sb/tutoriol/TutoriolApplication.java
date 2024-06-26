package com.sb.tutoriol;

import com.sb.tutoriol.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class TutoriolApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoriolApplication.class, args);
	}

}
