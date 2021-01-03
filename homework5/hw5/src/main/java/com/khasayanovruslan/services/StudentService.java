package com.khasayanovruslan.services;

import com.khasayanovruslan.dao.StudentDAO;
import com.khasayanovruslan.dao.StudentDAOImpl;
import com.khasayanovruslan.models.Student;

import java.util.List;

public class StudentService {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    public StudentService() {

    }

    public Student findStudent(Long id) {
        return studentDAO.findById(id);
    }

    public List<Student> findAllStudents() {
        return studentDAO.findAll();
    }

    public void saveStudent(Student student) {
        studentDAO.save(student);
    }

    public void updateStudent(Student student) {
        studentDAO.update(student);
    }

    public void deleteStudent(Student student) {
        studentDAO.delete(student);
    }
}
