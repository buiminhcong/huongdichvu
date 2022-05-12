package com.example.taskservice.service;

import com.example.taskservice.model.Result;
import com.example.taskservice.model.Student;
import com.example.taskservice.model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceImplm implements HomeService{

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CallAPI callAPI;

    @Override
    public String submitForm(String code) {
        Student s =  callAPI.getStudentByCode(code);
        if(s == null){
            return "Mã sinh viên không hợp lệ vui lòng nhập lại";
        }
        Transcript t = callAPI.getTranScripctByCode(code);

        Result r = new Result();
        r.setDiem(t.getDiem());
        r.setStudent(s);
        r.setKq(t.getDiem());

        callAPI.sendEmail(r);

        return "Họ tên: " + s.getName() +"\n" +
                "Mã sinh viên: "+ s.getCode() + "\n" +
                "Điểm: "+ t.getDiem() + "\n";
    }
    public static String tinhdiem(String diem){

        double d = Double.parseDouble(diem);

        String s = "";
        if(d <2.0){
            s = "Sinh viên hiện tại không đủ kết quả ra trường!";
        } else if(d >=2.0 && d <2.5){
            s = "Sinh viên hiện được bằng trung bình!";
        }
        else if(d >=2.5 && d <3.2){
            s = "Sinh viên hiện được bằng Khá!";
        }
        else if(d >=3.2 && d <3.6){
            s = "Sinh viên hiện được bằng Giỏi!";
        }
        else if(d >=3.6 && d <=4.0){
            s = "Sinh viên hiện được bằng Xuất sắc!";
        }
        return s;
    }

}
