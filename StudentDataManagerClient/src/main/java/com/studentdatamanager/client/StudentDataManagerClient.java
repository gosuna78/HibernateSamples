package com.studentdatamanager.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studentdatamanager.jpa.StudentDao;
import com.studentdatamanager.model.Student;

/**
 *
 */
public class StudentDataManagerClient {

    private static ApplicationContext appContext;

    private static StudentDao studentDao;

    private static void init() {
        appContext = new ClassPathXmlApplicationContext(
                "studentdatamanagerclient-spring-cfg.xml");
        studentDao = (StudentDao) appContext
                .getBean("studentDataManagerDao");
    }

    public static void main(final String[] args) {
        try {
            init();
        } catch (final Exception e) {
            System.out
                    .println("An exception occurrs context init. Exiting Application !!!");
            e.printStackTrace();
            System.exit(0);
        }
        // Save
        final Student student = new Student("FIST_NAME","LAST_NAME","EMAIL");
        studentDao.saveStudent(student);
    }
}
