package com.hospital.petclinic.services.map;

import com.hospital.petclinic.model.Speciality;
import com.hospital.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality t) {
        return super.save(t);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality t) {
        super.delete(t);
    }
}
