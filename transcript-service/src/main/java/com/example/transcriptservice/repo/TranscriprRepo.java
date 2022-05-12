package com.example.transcriptservice.repo;

import com.example.transcriptservice.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriprRepo extends JpaRepository<Transcript, Integer> {

    @Query(value = "select * from transcript where code_student = ?", nativeQuery = true)
    Transcript getTranscriptByCodeStudent(String code);

}
