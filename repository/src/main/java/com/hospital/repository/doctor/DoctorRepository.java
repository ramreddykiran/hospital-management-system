package com.hospital.repository.doctor;

import com.hospital.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor, String> {
}
