package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.PetType;
import com.hospital.petclinic.repositories.PetTypeRepository;
import com.hospital.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService extends CrudSDJpa<PetType, PetTypeRepository, Long> implements PetTypeService {

    public PetTypeSDJpaService(PetTypeRepository crudRepository) {
        super(crudRepository);
    }

}
