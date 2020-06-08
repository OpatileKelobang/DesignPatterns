/*
* Singleton Example:
* Access must be private
* */

package org.example.domain;

public class Student {

    private String studentNumber;
    private static Student student = null;

    // Private Constructor
    private Student(){

    }

    // Check if there is only one instance of Student in existence
    public static Student getInstance() {
        if (student == null){
            student = new Student();
        }
        return student;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
