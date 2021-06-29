package com.hospital.petclinic.service;

import java.util.Set;

public interface BaseService <T> {
    T findById(Long id);
    T save(T t);
    Set<T> findAll();
}
