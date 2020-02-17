package com.thoughtworks;

import java.util.ArrayList;

public class Teacher {
    private String name;
    ArrayList<Student> studentList;

    public Teacher(String name, ArrayList<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public void searchRepeat() {
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if(studentList.get(i).equals(studentList.get(j) ) ) {
                    System.out.println(studentList.get(i));
                    System.out.println(studentList.get(j));
                }
            }
        }
    }

}
