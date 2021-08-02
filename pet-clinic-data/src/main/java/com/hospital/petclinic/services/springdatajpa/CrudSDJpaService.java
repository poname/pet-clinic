package com.hospital.petclinic.services.springdatajpa;

import com.hospital.petclinic.model.BaseEntity;
import com.hospital.petclinic.services.CrudService;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CrudSDJpaService<T extends BaseEntity, S extends CrudRepository<T, ID>, ID extends Long> implements CrudService<T, ID> {

    protected final S crudRepository;

    public CrudSDJpaService(S crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public T findById(ID id) {
        return crudRepository.findById(id).orElse(null);
    }

    @Override
    public T save(T t) {
        return crudRepository.save(t);
    }

    @Override
    public Set<T> findAll() {
        return StreamSupport.stream(crudRepository.findAll().spliterator(), false).collect(Collectors.toSet());
    }

    @Override
    public void delete(T t) {
        crudRepository.delete(t);
    }

    @Override
    public void deleteById(ID id) {
        crudRepository.deleteById(id);
    }

}
