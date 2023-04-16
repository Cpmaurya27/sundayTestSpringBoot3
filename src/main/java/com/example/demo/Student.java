package com.example.demo;



public class Student {

    private String name;

    public Student() {

        System.out.println("Student Object is Created From default Const");
    }

    public Student(String name) {


        this.name = name;

        System.out.println("Student Object Is Created From ParamConst "  + this.name);
    }
    @Override
    public String toString(){
        return "Student_name:-> "+this.name;
    }

}