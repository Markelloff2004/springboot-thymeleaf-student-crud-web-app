package com.systems.studentmanagementsystem.controller;

import com.systems.studentmanagementsystem.entity.Student;
import com.systems.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/edit/{studentId}")
    public String editStudentForm(@PathVariable Long studentId  ,Model model) {
         model.addAttribute("student", studentService.getStudentById(studentId));
        return "edit_student";
    }

    @PostMapping("/{studentId}")
    public String updateStudent(@PathVariable Long studentId, @ModelAttribute("student") Student student) {
        student.setStudentId(studentId);
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/{studentId}")
    public String deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);

        return "redirect:/students";
    }
}
