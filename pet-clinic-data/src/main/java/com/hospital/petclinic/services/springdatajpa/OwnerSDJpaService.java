package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.Owner;
import com.hospital.petclinic.repositories.OwnerRepository;
import com.hospital.petclinic.repositories.PetRepository;
import com.hospital.petclinic.repositories.PetTypeRepository;
import com.hospital.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService extends CrudSDJpaService<Owner, OwnerRepository, Long> implements OwnerService {

    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository crudRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        super(crudRepository);
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return crudRepository.findByLastName(lastName);
    }
}
