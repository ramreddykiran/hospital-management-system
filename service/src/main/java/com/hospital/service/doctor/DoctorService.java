package com.hospital.service.doctor;

import com.hospital.model.doctor.Doctor;
import com.hospital.repository.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    public void addDoctors() {
        doctorRepository.saveAll(
                Stream.of(
                        new Doctor("11", "Doctor1", "specialist1"),
                        new Doctor("22", "Doctor2", "specialist2")
                ).collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }
}
