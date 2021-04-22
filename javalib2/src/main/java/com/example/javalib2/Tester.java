package com.example.javalib2;

import com.example.javalib2.hello.Person;
import com.example.javalib2.hello.Student;

public class Tester {
    public static void main(String[] args) {
        //System.out.println("Hello Word!");
        Person person = new Person();
        person.hello();
        person.hello("Eric");
        person.setHeight(1.7f);
        person.setWeight(78.8f);
        System.out.println(person.bmi());
        Student student = new Student("001","Mary",21,92);
        student.print();
    }
}