package com.hospital.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public Vet setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
        return this;
    }

}
