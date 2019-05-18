package ru.puga1chev.crudspring.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.puga1chev.crudspring.security.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    Optional<User> findById(Long aLong);
}
