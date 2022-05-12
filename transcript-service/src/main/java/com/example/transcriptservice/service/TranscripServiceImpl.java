package com.example.transcriptservice.service;

import com.example.transcriptservice.model.Transcript;
import com.example.transcriptservice.repo.TranscriprRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TranscripServiceImpl implements TranscripService {

    @Autowired
    private TranscriprRepo repo;


    @Override
    public Transcript getTranscriptByStudentCode(String code) {

        Optional<Transcript> op = Optional.ofNullable(repo.getTranscriptByCodeStudent(code));
        if (op.isPresent()){
            return op.get();
        }

        return null;
    }
}
