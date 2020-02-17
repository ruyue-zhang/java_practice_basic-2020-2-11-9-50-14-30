package com.thoughtworks;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String id;
    private String date;

    public Student(String name, String id, String date) {
        this.name = name;
        this.id = id;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public String toString() {
        int year = 0;
        try {
            year = getYear();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "我叫" + name +
                ", 我的学号是" + id +
                ", " + date +
                "入学，学龄" + year + "年";
    }

    private int getYear() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd");
        Date enrolTime = sdf.parse(date);
        long enrolTimeMs = enrolTime.getTime();
        long currentTime = new Date().getTime();
        long time = currentTime - enrolTimeMs;
        return (int)(time / (1000L * 60 * 60 * 24 * 365) );

    }
}
