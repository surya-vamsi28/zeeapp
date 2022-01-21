package com.zee.zee5app.repository.impl;
import java.util.ArrayList;
import java.util.Optional;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
	
private UserRepositoryImpl() {
		
	}
	private static UserRepository repository;
	public static UserRepository getInstance() {
		if(repository==null) {
			repository = new UserRepositoryImpl();
		}
		return repository;
	}
	
	private ArrayList<Register> arraylist = new ArrayList<>();

	@Override
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		boolean result = this.arraylist.add(register);
		if(result) {
			
		
		return "success";}
		
	else {
		return "fail";
	}
		}

	@Override
	public String updateUser(String id, Register register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Register> getUserById(String id) {
		// TODO Auto-generated method stub
		Register register2 = null;
		for (Register register : arraylist) {
			if(register!=null && register.getId().equals(id)) {
				register2 = register ;
			}
			
		}
		return Optional.ofNullable(register2);
//		if register is holding null it will act like empty
//		if register is holding object if will act like of
	}

	@Override
	public ArrayList getAllUsers() {
		// TODO Auto-generated method stub
		return arraylist;
		
		
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
