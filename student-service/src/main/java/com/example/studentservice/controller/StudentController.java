package com.example.studentservice.controller;

import com.example.studentservice.mode.Student;
import com.example.studentservice.service.StudentInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentInf studentInf;

    @GetMapping("/{code}")
    public Student getStudentByCode(@PathVariable("code") String code){
        return studentInf.getSutentByCode(code);
    }

}
