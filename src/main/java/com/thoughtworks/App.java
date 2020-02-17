package com.thoughtworks;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    //Student student = new Student("张三", "001", "2019.02.11");
   // System.out.println(student);
    ArrayList<Student> studentList= new ArrayList<>();
    studentList.add(new Student("张三","001","2019.02.11"));
    studentList.add(new Student("李四","002","2019.02.10"));
    studentList.add(new Student("王五","001","2019.02.9"));

    Teacher teacher = new Teacher("张龙", studentList);
    teacher.searchRepeat();
  }
}
