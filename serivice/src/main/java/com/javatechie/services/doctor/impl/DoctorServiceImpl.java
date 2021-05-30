package com.javatechie.services.doctor.impl;

import com.javatechie.dao.doctor.DoctorRepository;
import com.javatechie.domain.model.Doctor;
import com.javatechie.services.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Override
    @PostConstruct
    public void initDoctor() {
        repository.saveAll(Stream.of(
                new Doctor(101, "John", "Cardiac"),
                new Doctor(102, "Peter", "Eye"))
                .collect(Collectors.toList()));
    }

    @Override
    public List<Doctor> getDoctors() {
        return repository.findAll();
    }
}
