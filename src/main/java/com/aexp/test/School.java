package com.aexp.test;

import java.util.*;


public class School {

    public static void main(String args[]){


        Student s1 = new Student(1, "xyz");//1
        Student s2 = new Student(2, "abc");//2
        Student s3 = new Student(2, "aadfsafbc");//2
        Student s4 = new Student(4, "aadfsafbc");//2

        Set<Student> set = new TreeSet<>();
        set.add(s2);
        set.add(s1);
        boolean isInserted = set.add(s3);
        if(isInserted){
            System.out.println("Student inserted successfully");
        }else{
            System.out.println("Studnet with Given Roll Number already existed");
        }
        boolean isRemoved = set.remove(s4);

        System.out.println(set);

        /*String s1 = new String("sateesh");
        String s2 = new String("srujana");

        Set<String> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);

        s2 = "sateesh";
        System.out.println(set);*/




    }
}
