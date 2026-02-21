package com.studentmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Optional<Student> getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int id, Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, student);
                return;
            }
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}