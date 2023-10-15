package com.aexp.test;

import java.util.Objects;

/**
 * This class is a blue print for creating studnet objects
 * This class will have three properties
 */
public final class Student implements Comparable<Student> {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private int rollNumber;
    private String name;
    private String email;

    private static int studentCount = 0;

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount() {
        Student.studentCount++;//studentCount = studentCount + 1;
    }

    public Student(){
        setStudentCount();
    }
    public Student(int rollNumber, String name, String email){
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
        setStudentCount();
    }

    public Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
        setStudentCount();
    }

    public int getRollNumber() {
        return rollNumber;
    }

  /*  public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    public boolean hasEvenRollNumber(){
        return this.rollNumber % 2 == 0;
    }


    @Override
    public int compareTo(Student o) {
        if(this.rollNumber == o.rollNumber){
            return 0;
        }else if(o.rollNumber < this.rollNumber){
            return -1;
        }else{
            return 1;
        }

    }
}
