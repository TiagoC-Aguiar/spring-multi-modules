package com.javatechie.web.controller.doctor;

import com.javatechie.domain.model.Doctor;
import com.javatechie.services.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return service.getDoctors();
    }
}
