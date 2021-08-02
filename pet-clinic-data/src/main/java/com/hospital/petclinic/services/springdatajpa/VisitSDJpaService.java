package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.Visit;
import com.hospital.petclinic.repositories.VisitRepository;
import com.hospital.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService extends CrudSDJpa<Visit, VisitRepository, Long> implements VisitService {

    public VisitSDJpaService(VisitRepository crudRepository) {
        super(crudRepository);
    }

}
