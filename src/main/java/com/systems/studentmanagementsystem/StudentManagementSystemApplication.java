package com.systems.studentmanagementsystem;

import com.systems.studentmanagementsystem.entity.Student;
import com.systems.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        // Inițializează și setează primul obiect Student
//        Student student1 = new Student();
//        student1.setFirstName("John");
//        student1.setLastName("Doe");
//        student1.setEmail("john.doe@example.com");
//
//// Inițializează și setează al doilea obiect Student
//        Student student2 = new Student();
//        student2.setFirstName("Jane");
//        student2.setLastName("Smith");
//        student2.setEmail("jane.smith@example.com");
//
//// Inițializează și setează al treilea obiect Student
//        Student student3 = new Student();
//        student3.setFirstName("Alice");
//        student3.setLastName("Johnson");
//        student3.setEmail("alice.johnson@example.com");
//
//// Inițializează și setează al patrulea obiect Student
//        Student student4 = new Student();
//        student4.setFirstName("Bob");
//        student4.setLastName("Brown");
//        student4.setEmail("bob.brown@example.com");
//
//// Inițializează și setează al cincilea obiect Student
//        Student student5 = new Student();
//        student5.setFirstName("Charlie");
//        student5.setLastName("Davis");
//        student5.setEmail("charlie.davis@example.com");
//
//// Salvează toate obiectele Student în baza de date
//        studentRepository.save(student1);
//        studentRepository.save(student2);
//        studentRepository.save(student3);
//        studentRepository.save(student4);
//        studentRepository.save(student5);
    }
}
