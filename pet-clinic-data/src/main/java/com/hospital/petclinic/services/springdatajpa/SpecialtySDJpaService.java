package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.Speciality;
import com.hospital.petclinic.repositories.SpecialtyRepository;
import com.hospital.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService extends CrudSDJpaService<Speciality, SpecialtyRepository, Long> implements SpecialityService {

    public SpecialtySDJpaService(SpecialtyRepository crudRepository) {
        super(crudRepository);
    }

}
