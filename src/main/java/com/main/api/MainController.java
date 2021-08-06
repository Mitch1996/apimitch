package com.main.api;

import com.main.api.dto.StudentDTO;
import com.main.api.service.StudentServiceApi;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class MainController{

    @Autowired
    private StudentServiceApi studentServiceApi;

    @GetMapping(value = "/all")
    public List<StudentDTO> getAll() throws Exception {
        return studentServiceApi.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public StudentDTO find(@PathVariable String id) throws Exception {
        return studentServiceApi.get(id);
    }

    @PostMapping(value = "/save/{id}")
    public ResponseEntity<String> save(@RequestBody Student student, @PathVariable String id) throws Exception {
        if (id == null || id.length() == 0 || id.equals("null")) {
            id = studentServiceApi.save(student);
        } else {
            studentServiceApi.save(student, id);
        }
        return new ResponseEntity<String>(id, HttpStatus.OK);
    }


    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<StudentDTO> delete(@PathVariable String id) throws Exception {
        StudentDTO studentDTO = studentServiceApi.get(id);
        if (studentDTO != null) {
            studentServiceApi.delete(id);
        } else {
            return new ResponseEntity<StudentDTO>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<StudentDTO>(studentDTO, HttpStatus.OK);
    }
}
