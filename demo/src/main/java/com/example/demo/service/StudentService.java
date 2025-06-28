package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.addAll(List.of(
                new Student("Obed Sarkodie", "Computer Science"),
                new Student("Dennis Kofi", "Computer Science"),
                new Student("Dorothy Kortey", "Infomation Technology")));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Optional<Student> getStudentByID(String id) {
        return students.stream()
                .filter(s -> s.getID().equals(id))
                .findFirst();
    }

    

    public Student addStudent(Student student) {
        return student;
    }

    public Student updateStudent(String id, Student updateStudent) {
        for (int index = 0; index < students.size(); index++) {
            if (students.get(index).getID().equals(id)) {
                students.set(index, updateStudent);
            }
            return updateStudent;
        }
        students.add(updateStudent);
        return updateStudent;
    }

    public void deleteStudentByID(String id) {
        students.removeIf(s -> s.getID().equals(id));
    }
}
