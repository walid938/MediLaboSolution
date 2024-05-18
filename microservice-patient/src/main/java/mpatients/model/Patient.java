package mpatients.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Table(name= "patient", uniqueConstraints = @UniqueConstraint(columnNames = {"first_name", "last_name"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Adress adress;
    @Column(name= "phone_number")
    private String phoneNumber;



}
