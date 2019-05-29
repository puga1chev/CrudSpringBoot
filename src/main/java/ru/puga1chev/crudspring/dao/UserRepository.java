package ru.puga1chev.crudspring.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.puga1chev.crudspring.entity.User;
import java.util.*;

@Repository
public interface UserRepository extends CrudRepository<User, Long>, UserCustomRepository {

    List<User> findByLogin(String login);

    @Query(value = "SELECT u FROM users u WHERE u.login = :login",
    nativeQuery = true)
    List<User> findByLoginNativeQuery(@Param("login") String login);

    @Query(value = "SELECT u FROM users u WHERE u.login = :login")
    List<User> findByLoginJPQL(@Param("login") String login);


}
