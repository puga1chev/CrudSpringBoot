
package ru.puga1chev.crudspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.puga1chev.crudspring.security.entity.Role;
import ru.puga1chev.crudspring.security.entity.User;
import ru.puga1chev.crudspring.security.repository.RoleRepository;
import ru.puga1chev.crudspring.security.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService
{
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(transactionManager="securityTransactionManager")
	public Optional<User> getUsers()
	{
		return userRepository.findById(0L);
	}

	@Transactional(transactionManager="ordersTransactionManager")
	public Optional <Role> getOrders()
	{
		return roleRepository.findById(0L);
	}
}
