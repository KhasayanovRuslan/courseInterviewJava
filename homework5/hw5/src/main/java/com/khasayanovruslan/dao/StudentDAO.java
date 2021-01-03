package com.khasayanovruslan.dao;

import com.khasayanovruslan.models.Student;

import java.util.List;

public interface StudentDAO {
    public Student findById(Long id);

    public List<Student> findAll();

    public void save(Student student);

    public void update(Student student);

    public void delete(Student student);
}
