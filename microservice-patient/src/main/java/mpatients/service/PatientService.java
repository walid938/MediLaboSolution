package mpatients.service;

import mpatients.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PatientService   {

    List<Patient> getAllPatient();

    public Patient getPatientById(int id);

    public Patient createPatient (Patient patient);
    public Patient updatePatient (Patient patient);

    public void deletePatient(int id);

    public Optional<Patient> getPatient(String firstName, String lastName);




}
