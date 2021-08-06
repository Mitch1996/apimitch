package com.main.api.service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.main.api.Student;
import com.main.api.commons.GenericServiceImpl;
import com.main.api.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  extends GenericServiceImpl<Student, StudentDTO> implements StudentServiceApi{

    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("students");
    }
}
