package com.leti.obshaga.preparing.mini.app;

import java.util.ArrayList;
import java.util.List;

public class Group implements GroupInterface {
  private Prepodavatel prepodavatel;
  private List<Student> studentList;
  public Group(int size,Prepodavatel prepodavatel){
      this.prepodavatel = prepodavatel;
      studentList = new ArrayList<>(size);
  }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteStudent(String name) {
        for (Student student:studentList){
            if(student.getName().equals(name)){
                studentList.remove(student);
                return;
            }
        }
        throw new RuntimeException("Takogo studenta net!");
    }

    @Override
    public void showAll() {
      for (Student student:studentList){
          System.out.println("*******");
          System.out.println(student);
          System.out.println("*******");
      }

    }

    @Override
    public Student getStudent(String name) {
        for (Student student:studentList){
            if(student.getName().equals(name)){
                return student;
            }
        }
        throw new RuntimeException("Takogo studenta net!");
    }

    @Override
    public void swapPrepod(Prepodavatel newPrepod) {
        System.out.println("Prepod uvolen");
        prepodavatel = newPrepod;
        System.out.println("Noviy prepod - " + prepodavatel.getName());
    }
}
