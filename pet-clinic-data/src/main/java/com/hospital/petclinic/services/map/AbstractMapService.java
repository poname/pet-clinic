package com.hospital.petclinic.services.map;

import com.hospital.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T t) {
        if (t != null) {
            if (t.getId() == null) {
                t.setId(generateNextId());
            }
            map.put(t.getId(), t);
        } else {
            throw new RuntimeException("object cannot be null");
        }

        return t;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    Long generateNextId() {
        if (map.size() == 0) {
            return 1L;
        } else {
            return Collections.max(map.keySet()) + 1;
        }
    }

}
