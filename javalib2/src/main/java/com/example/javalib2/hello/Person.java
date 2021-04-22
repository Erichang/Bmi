package com.example.javalib2.hello;

public class Person {
    float height;
    float weight;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float bmi() {
        float bmi = weight / (height*height) ;
        return bmi;
    }

    public void hello(){
        System.out.println("Hello Android");
    }
    public void hello(String name){
        System.out.println("Hello,"+name);
    }
}
