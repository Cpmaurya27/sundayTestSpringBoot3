package com.example.demo.Controller;

import com.example.demo.MailSend.HandleMail;
import com.example.demo.MailSend.MailConstants;
import com.example.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    Student student;
    @GetMapping("/student")
    public String GetStudent(){
        MailConstants Gmail = new MailConstants();
        Gmail.SENDER="cpmaurya25@gmail.com";
        Gmail.RECEIVER ="cadchandu9995@gmail.com";
        Gmail.MESSAGE = student.toString();
        HandleMail mailer = new HandleMail();
        mailer.sendMail();
        return student.toString();
    }
}
