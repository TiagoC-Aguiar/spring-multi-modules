package com.javatechie.services.doctor;

import com.javatechie.domain.model.Doctor;

import java.util.List;

public interface DoctorService {
    void initDoctor();
    List<Doctor> getDoctors();
}
