package com.example.javalib2.hello;

public class Student {
    public static int pass=60;
    String id;
    String name;
    float math;
    float english;

    public Student(String id, String name, float math, float english) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print(){
        System.out.print("id:"+id+" name:"+name+" math:"+math +" english:"+english);
        if(getavg() < pass){
            System.out.println("*");
        }
        else{
            System.out.println("");
        }
    }

    public int getavg(){
        return (int)(math+english)/2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }
}
