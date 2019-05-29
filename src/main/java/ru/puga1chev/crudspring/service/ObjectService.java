package ru.puga1chev.crudspring.service;

import ru.puga1chev.crudspring.entity.User;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public interface ObjectService<T> {

    public void save(T obj);
    public ArrayList<T> findAll(String sortedBy);
    public Optional<T> getById(Long id);
    public void deleteById(Long id);
    public ArrayList<T> findByLogin(String login);
}
