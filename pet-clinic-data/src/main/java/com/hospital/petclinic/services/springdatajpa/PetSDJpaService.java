package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.Pet;
import com.hospital.petclinic.repositories.PetRepository;
import com.hospital.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetSDJpaService extends CrudSDJpa<Pet, PetRepository, Long> implements PetService {

    public PetSDJpaService(PetRepository crudRepository) {
        super(crudRepository);
    }

}
