package com.example.studentservice.service;

import com.example.studentservice.mode.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface StudentInf {


    Student getSutentByCode(String code);

}
