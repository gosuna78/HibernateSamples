package com.studentdatamanager.jpa;

import com.studentdatamanager.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public class StudentDaoImpl extends HibernateDaoSupport implements
    StudentDao {

    @Autowired
    public void init(final SessionFactory factory) {
        setSessionFactory(factory);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveStudent(final Student student) {
        getHibernateTemplate().saveOrUpdate(student);
    }

    public List<Student> getAllStudent() {
        return getHibernateTemplate().loadAll(Student.class);
    }

    public Student getStudentById(final int studentId) {
        return getHibernateTemplate().get(Student.class, studentId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteStudent(final int studentId) {
        getHibernateTemplate().delete(getStudentById(studentId));
        return 0;
    }
}
