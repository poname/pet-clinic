package com.hospital.petclinic.services.map;

import com.hospital.petclinic.model.Vet;
import com.hospital.petclinic.services.SpecialityService;
import com.hospital.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {

        if (vet != null) {
            vet.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    specialityService.save(speciality);
                }
            });

            return super.save(vet);
        } else {
            return null;
        }
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

}
