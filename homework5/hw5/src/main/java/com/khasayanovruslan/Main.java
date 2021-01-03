package com.khasayanovruslan;

import com.khasayanovruslan.models.Student;
import com.khasayanovruslan.services.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student student1 = new Student(10L,"Ivan4", 5);
        Student student2 = new Student(11L,"Vasya4", 5);
        Student student3 = new Student(12L,"Petr4", 5);

        studentService.saveStudent(student1);
        studentService.saveStudent(student2);
        studentService.saveStudent(student3);

        Student student = studentService.findStudent(10L);
        System.out.println(student);

        studentService.deleteStudent(student1);

        student2.setName("Vasya44");
        studentService.updateStudent(student2);

        List<Student> students = studentService.findAllStudents();
        for (Student s: students) {
            System.out.println(s);
        }
    }
}