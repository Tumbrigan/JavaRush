package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students) {
            if (Double.compare(student.getAverageGrade(), averageGrade) == 0) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
//        Student studentWithMaxAverGrade = null;
//        if (students.size() > 1) {
//        List<Student> sstudents = new ArrayList<>();
//        Student studentWithMaxAverGrade = students.get(0);
//        double maxAverageGrade = studentWithMaxAverGrade.getAverageGrade();
//        for (int i = 1; i < students.size(); i++) {
//            if (students.get(i).getAverageGrade() > maxAverageGrade)
//                sstudents.add(students.get(i));
//        }
//        return sstudents.get(0);
        return students
                .stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade))
                .get();
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        Student studentWithMinAverGrad = null;
        if (students.size() > 0) {
            studentWithMinAverGrad = students.get(0);
            double maxAverageGrade = studentWithMinAverGrad.getAverageGrade();
            for (Student student : students) {
                if (student.getAverageGrade() < maxAverageGrade)
                    studentWithMinAverGrad = student;
            }
        }
        return studentWithMinAverGrad;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}