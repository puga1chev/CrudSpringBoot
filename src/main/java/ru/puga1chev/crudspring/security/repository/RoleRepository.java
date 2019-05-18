package ru.puga1chev.crudspring.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.puga1chev.crudspring.security.entity.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    @Override
    Optional<Role> findById(Long aLong);
}
