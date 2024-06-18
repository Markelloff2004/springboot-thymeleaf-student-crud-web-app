package com.systems.studentmanagementsystem.service;

import com.systems.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
