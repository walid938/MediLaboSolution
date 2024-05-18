package mpatients.service;

import mpatients.model.Adress;
import mpatients.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService
{
    private AddressRepository addressRepository;
    public AddressServiceImpl (AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public Adress getAddress(String number, String street) {
        return addressRepository.findByNumberAndStreet(number,street);
    }
}
