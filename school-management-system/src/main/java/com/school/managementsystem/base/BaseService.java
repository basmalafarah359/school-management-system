package com.school.managementsystem.base;

import java.util.List;
import java.util.Optional;

public  abstract class BaseService<T extends BaseEntity,ID> {

protected final BaseRepository<T,ID> repository;

public BaseService(BaseRepository<T,ID>repository){

    this.repository =repository;
}
    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public T update(T entity) {
        return repository.save(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}







