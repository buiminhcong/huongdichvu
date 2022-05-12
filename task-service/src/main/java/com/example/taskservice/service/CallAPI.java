package com.example.taskservice.service;

import com.example.taskservice.model.Result;
import com.example.taskservice.model.Student;
import com.example.taskservice.model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallAPI {

    @Autowired
    RestTemplate restTemplate;

    public Student getStudentByCode(String code){
        Student s = restTemplate.getForObject("http://student-service" +
                "/api/student/{code}", Student.class, code);
        return s;
    }

    public Transcript getTranScripctByCode(String code){
        Transcript t = restTemplate.getForObject("http://transcript-service" +
                "/api/transcript/{code}", Transcript.class, code);
        return t;
    }

    public void sendEmail(Result result) {

        restTemplate.postForObject(
                "http://notification-service" + "/notification",
                result, Result.class
        );
    }

}
