package com.systems.studentmanagementsystem.service;

import com.systems.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    Student getStudentById(Long id);
    List<Student> getAllStudents();

    void  saveStudent(Student student);
    void deleteStudent(Long studentId);
}
