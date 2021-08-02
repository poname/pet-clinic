package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.Vet;
import com.hospital.petclinic.repositories.VetRepository;
import com.hospital.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetSDJpaService extends CrudSDJpa<Vet, VetRepository, Long> implements VetService {
    
    public VetSDJpaService(VetRepository crudRepository) {
        super(crudRepository);
    }

}
