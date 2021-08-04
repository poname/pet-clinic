package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.Owner;
import com.hospital.petclinic.repositories.OwnerRepository;
import com.hospital.petclinic.repositories.PetRepository;
import com.hospital.petclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    static final String LAST_NAME = "Smith";
    static final Long OWNER_ID = 1L;

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(OWNER_ID).lastName(LAST_NAME).build();
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = service.findById(OWNER_ID);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(OWNER_ID);

        assertNull(owner);
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerRepository.save(any())).thenReturn(returnOwner);

        Owner savedOwner = ownerRepository.save(Owner.builder().id(1L).build());

        assertNotNull(savedOwner);
        verify(ownerRepository, times(1)).save(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void delete() {
        service.delete(returnOwner);
        verify(ownerRepository, times(1)).delete(eq(returnOwner));
    }

    @Test
    void deleteById() {
        service.deleteById(OWNER_ID);
        verify(ownerRepository, times(1)).deleteById(eq(OWNER_ID));
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(anyString())).thenReturn(returnOwner);

        Owner smith = ownerRepository.findByLastName("Smith");

        assertNotNull(smith);
    }
}