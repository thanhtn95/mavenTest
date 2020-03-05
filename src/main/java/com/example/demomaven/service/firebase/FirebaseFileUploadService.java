package com.example.demomaven.service.firebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FirebaseFileUploadService {
    @Autowired
    private FirebaseStorageUploadService firebaseStorageUploadService;

    public String uploadSingleFileToFireBase(MultipartFile multipartFile) {
        try {
            String contentType = multipartFile.getContentType();
            String storageDir;
            if (contentType.startsWith("image")) {
                storageDir = "images";
            } else {
                storageDir = "files";
            }
            String downloadUrl = firebaseStorageUploadService.upload(storageDir, multipartFile.getOriginalFilename(), multipartFile.getBytes(), contentType);
            return downloadUrl;
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
