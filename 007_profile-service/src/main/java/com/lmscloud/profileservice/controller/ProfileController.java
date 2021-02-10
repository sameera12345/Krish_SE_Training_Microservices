package com.lmscloud.profileservice.controller;

import com.lmscloud.profileservice.service.StudentService;
import com.sameera.lmscloud.commons.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }
}
