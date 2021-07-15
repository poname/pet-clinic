package com.hospital.petclinic.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public Vet setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
        return this;
    }

}
