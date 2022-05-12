package com.example.studentservice.service;

import com.example.studentservice.mode.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements StudentInf {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getSutentByCode(String code) {

        Optional<Student> op = Optional.ofNullable(studentRepository.getStudentByCode(code));
        if(op.isPresent()){
            return op.get();
        }
        return null;
    }
}
