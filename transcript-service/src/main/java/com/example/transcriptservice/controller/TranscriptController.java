package com.example.transcriptservice.controller;

import com.example.transcriptservice.model.Transcript;
import com.example.transcriptservice.service.TranscripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transcript")
public class TranscriptController {

    @Autowired
    private TranscripService transcripService;

    @GetMapping("/{code}")
    public Transcript getTranScripByStudentCode(@PathVariable("code") String code){
        return transcripService.getTranscriptByStudentCode(code);
    }

}
