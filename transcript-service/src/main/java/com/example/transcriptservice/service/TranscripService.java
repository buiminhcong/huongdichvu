package com.example.transcriptservice.service;

import com.example.transcriptservice.model.Transcript;
import org.springframework.stereotype.Service;

@Service
public interface TranscripService {

    Transcript getTranscriptByStudentCode(String code);

}
