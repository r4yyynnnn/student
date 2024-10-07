package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(StudentEntity student) {
        Optional<StudentEntity> studentOptional = studentRepository
                .findStudentByNisn(student.getNisn());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("Nisn taken");
        }
        studentRepository.save(student);
    }
}
