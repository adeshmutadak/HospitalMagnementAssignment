package com.example.HospitalMagnementAssignment.Repository;

import com.example.HospitalMagnementAssignment.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
    Doctor findByEmail(String email);

    Doctor findByPhone(String phoneNumber);

    String findBySpeciality(String ent);
}
