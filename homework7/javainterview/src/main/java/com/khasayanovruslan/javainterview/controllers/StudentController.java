package com.khasayanovruslan.javainterview.controllers;

import com.khasayanovruslan.javainterview.entities.Student;
import com.khasayanovruslan.javainterview.exceptions.ResourceNotFoundException;
import com.khasayanovruslan.javainterview.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping
    public String showAllStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Student getOneStudentById(@PathVariable Long id) {
        return studentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student with id: " + id + " doesn't exists"));
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student s = studentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student with id: " + id + " doesn't exists (for edit)"));
        model.addAttribute("student", s);
        return "edit_student";
    }

    @PostMapping("/edit")
    public String showEditForm(@ModelAttribute Student student) {
        studentService.saveOrUpdate(student);
        return "redirect:/students";
    }

    @GetMapping("/add")
    public String addStudentForm(Model model) {
        Student s = new Student();
        model.addAttribute("student", s);
        return "edit_student";
    }

    @PostMapping("/add")
    public String addStudentForm(@ModelAttribute Student student) {
        studentService.saveOrUpdate(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String deleteOneStudentById(@PathVariable Long id) {
        studentService.deleteById(id);
        return "ok";
    }
}
