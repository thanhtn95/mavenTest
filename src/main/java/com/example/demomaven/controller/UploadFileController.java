package com.example.demomaven.controller;

import com.example.demomaven.service.firebase.FirebaseFileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/files/")
public class UploadFileController {
    @Autowired
    private FirebaseFileUploadService firebaseFileUploadService;
    @GetMapping("uploadFile")
    public ModelAndView getUploadForm() {
        return new ModelAndView("uploadFile");
    }

    @PostMapping("doUpload")
    public ModelAndView doUpload(@RequestParam("file") MultipartFile multipartFile) {
        String result = firebaseFileUploadService.uploadSingleFileToFireBase(multipartFile);
        System.out.println(result);
        return new ModelAndView("Result");
    }
}
