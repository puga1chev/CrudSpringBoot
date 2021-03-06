package ru.puga1chev.crudspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.puga1chev.crudspring.dao.RoleRepository;
import ru.puga1chev.crudspring.entity.Role;
import java.util.*;

@Service
public class RoleService implements ObjectService<Role> {

    @Autowired
    private RoleRepository repository;

    public void save(Role role) {
        role = repository.save(role);
    }

    public ArrayList<Role> findAll(String sortedBy) {
        // todo: sorted
        return (ArrayList<Role>) repository.findAll();
    }

    public Optional<Role> getById(Long id) {

        return repository.findById(id);
    }

    public void deleteById(Long id) {

        repository.deleteById(id);
    }

    @Override
    public ArrayList<Role> findByLogin(String login) {
        return null; // todo: throw exeption
    }


}
