package com.example.taskservice.cotroller;

import com.example.taskservice.model.Result;
import com.example.taskservice.model.Student;
import com.example.taskservice.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/{code}")
    public String submitForm(@PathVariable("code") String code){
        return homeService.submitForm(code);
    }

}
