package com.studentdatamanager.jpa;

import java.util.List;

import com.studentdatamanager.model.Student;

/**
 * The interface Student dao.
 */
public interface StudentDao {

    /**
     * Save student.
     *
     * @param student the student
     */
    void saveStudent(final Student student);

    /**
     * Gets all student.
     *
     * @return the all student
     */
    List<Student> getAllStudent();

    /**
     * Gets student by id.
     *
     * @param studentId the student id
     * @return the student by id
     */
    Student getStudentById(final int studentId);

    /**
     * Delete student int.
     *
     * @param studentId the student id
     * @return the int
     */
    int deleteStudent(final int studentId);

}
