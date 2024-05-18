package mpatients.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import mpatients.model.Patient;
import mpatients.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository=patientRepository;
    }


    public List<Patient> getAllPatient(){
        return patientRepository.findAll();

    }

    public Optional<Patient> getPatient(String firstName, String lastName) {
        return patientRepository.findByFirstNameAndLastName(firstName,lastName);
    }

    public Patient getPatientById(int id)
    {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient createPatient (Patient patient){
        return patientRepository.save(patient);
    }

    public Patient updatePatient (Patient patient){
        return patientRepository.save(patient);
    }
    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }
}
