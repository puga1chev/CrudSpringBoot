package ru.puga1chev.crudspring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.puga1chev.crudspring.entity.Role;
import java.util.*;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
