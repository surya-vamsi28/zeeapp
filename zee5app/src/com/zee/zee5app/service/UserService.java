package com.zee.zee5app.service;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;


public class UserService {

	private UserRepository repository = UserRepository.getInstance();
	private UserService() {
		
	}
static UserService service = null;

public static UserService getInstance() {
	if(service==null) {
		service = new UserService();
	}
	return service;
}
public String addUser(Register register) {
	return this.repository.addUser(register);
}
public Register getUserById(String id) {
	return repository.getUserById(id);
}
public Register[] getUsers() {
	return repository.getUsers();
	
}
public String updateUser(String id , Register register) {
	return repository.updateUser(id, register);
}
public String deleteUser(String id) {
	return repository.deleteUser(id);
}
}
