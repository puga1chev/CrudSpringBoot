package ru.puga1chev.crudspring.dao;

import ru.puga1chev.crudspring.entity.User;
import java.util.*;

public interface UserCustomRepository {

    List<User> findByLoginJDBC(String login);
}
