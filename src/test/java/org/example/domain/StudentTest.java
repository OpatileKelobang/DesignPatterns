package org.example.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreate() {
        // Create 2 different objects of student (student and student 2)
        Student student = Student.getInstance();
        Student student_2 = Student.getInstance();

        // Test Object Identity (If true, test will pass)
        Assert.assertEquals(student, student_2);
    }

}