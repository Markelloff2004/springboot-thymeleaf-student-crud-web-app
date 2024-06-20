package com.systems.studentmanagementsystem.service.impl;

import com.systems.studentmanagementsystem.entity.Student;
import com.systems.studentmanagementsystem.repository.StudentRepository;
import com.systems.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void  saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.delete(getStudentById(studentId));
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        Student searchedStudent;
        if (optionalStudent.isPresent()) {
            searchedStudent = optionalStudent.get();
        } else {
            throw new RuntimeException("Employee not found");
        }
        return searchedStudent;
    }
}
