package com.studentdatamanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.studentdatamanager.jpa.StudentDao;
import com.studentdatamanager.model.Student;

/**
 * The type Student dao service.
 */
public class StudentDaoService implements StudentDao {

    @Autowired
    private StudentDao studentDao;

    public void saveStudent(final Student student) {
        studentDao.saveStudent(student);

    }

    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    public Student getStudentById(final int studentId) {
        return studentDao.getStudentById(studentId);
    }

    public int deleteStudent(final int studentId) {
        return studentDao.deleteStudent(studentId);
    }

}
