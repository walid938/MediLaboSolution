package mpatients.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="address", uniqueConstraints = @UniqueConstraint(columnNames = {"number", "street"}))
public class Adress {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
     int id;
     String number;
     String street;

}

