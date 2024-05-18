package mpatients.repository;

import mpatients.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Adress, Integer> {
    Adress findByNumberAndStreet(String number, String street);

}
