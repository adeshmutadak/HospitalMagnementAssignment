package com.example.HospitalMagnementAssignment.Repository;

import com.example.HospitalMagnementAssignment.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    Patient findByEmail(String email);

    Patient findByPhoneNumber(String phoneNumber);
}
