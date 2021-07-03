package com.hospital.petclinic.service.map;

import com.hospital.petclinic.model.BaseEntity;
import com.hospital.petclinic.service.CrudService;

import java.util.Set;

public class CrudMapService<T extends BaseEntity, ID extends Long> extends AbstractMapService<T, ID> implements CrudService<T, ID> {
    @Override
    public T findById(ID id) {
        return super.findById(id);
    }

    @Override
    public T save(T t) {
        return super.save(t);
    }

    @Override
    public Set<T> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(ID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(T t) {
        super.delete(t);
    }
}
