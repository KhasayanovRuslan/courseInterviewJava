package com.khasayanovruslan.dao;

import com.khasayanovruslan.utils.HibernateSessionFactoryUtil;
import com.khasayanovruslan.models.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public Student findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = (List<Student>) HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from Student")
                .list();
        return students;
    }

    @Override
    public void save(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();;
        session.close();
    }

    @Override
    public void update(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();;
        session.close();
    }

    @Override
    public void delete(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();;
        session.close();
    }
}
