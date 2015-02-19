package com.studentdatamanager.jpa;

import java.util.List;

import com.studentdatamanager.model.Student;

public interface StudentDao {

    public void saveStudent(final Student student);

    public List<Student> getAllStudent();

    public Student getStudentById(final int studentId);

    public int deleteStudent(final int studentId);

}
