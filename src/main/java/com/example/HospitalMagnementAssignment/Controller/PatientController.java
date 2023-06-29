package com.example.HospitalMagnementAssignment.Controller;

import com.example.HospitalMagnementAssignment.Model.Patient;
import com.example.HospitalMagnementAssignment.Service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class PatientController {


    @RestController
    public class PatientController {

        @Autowired
        private PatientService patientService;

        @PostMapping
        public ResponseEntity<String> addPatient(@Valid @RequestBody Patient patient) {
            return patientService.addPatient(patient);
        }

        @GetMapping("/doctor/{patientId}")
        public String suggestDoctor(@PathVariable Long patientId) {
            return patientService.suggestDoctor(patientId);
        }
    }
}