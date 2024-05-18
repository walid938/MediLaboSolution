package mpatients.controller;


import mpatients.model.Patient;
import mpatients.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {


    private PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }


    @GetMapping("Patient/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") int id){
        return ResponseEntity.status(HttpStatus.OK).body(patientService.getPatientById(id));
    }

    @GetMapping("Patient/list")
    public ResponseEntity getAllPatient(){
        return ResponseEntity.status(HttpStatus.OK).body(patientService.getAllPatient());
    }

    @GetMapping("/Patient")
    public ResponseEntity getPatient(@RequestParam String firstName, @RequestParam String lastName) {
        return patientService.getPatient(firstName, lastName).map(ResponseEntity::ok).orElse(new ResponseEntity(HttpStatus.NO_CONTENT));
    }

    @PostMapping("/patient")
    public ResponseEntity createPatient(@RequestBody Patient patient) {
        patientService.createPatient(patient);
        return new ResponseEntity(HttpStatus.CREATED);

    }

    @PutMapping("/patient")
    public ResponseEntity updatePatient(@RequestBody Patient patient) {
        patientService.updatePatient(patient);
        return new ResponseEntity(HttpStatus.OK);

    }

    @DeleteMapping("/patient/{id}")
    public ResponseEntity deletePatient(@PathVariable("id") int id) {
        patientService.deletePatient(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
