package com.lmscloud.profileservice.service;

import com.lmscloud.profileservice.repository.StudentRepository;
import com.sameera.lmscloud.commons.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}