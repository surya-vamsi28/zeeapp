package com.zee.zee5app.repository.impl;
import java.util.ArrayList;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;

public class UserRepositoryImpl2 implements UserRepository {
	
	private UserRepositoryImpl() {
		
	}
	private static UserRepository repository;
	public static UserRepository getInstance() {
		if(repository==null) {
			repository = new UserRepositoryImpl();
		}
		return repository;
	}
	private Register[] registers = new Register[10];
	
	//when we ude dc for AR by default it will hold 10 elements of type register
	private static int count = -1;
	@Override
	
	
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		boolean result = this.arraylist.add(register);
		if(result) {
			
		
		return "success";}
		}
		
	

	@Override
	public String updateUser(String id, Register register1) {
		// TODO Auto-generated method stub
		int count1 = 0;
		for (Register register : registers) {
			if(register != null && register.getId().equals(id)) {
				registers[count1] = register1;
				return("Completed");
			}
			count1++;
			
		}
		return("Not Completed");
	}

	@Override
	public Register getUserById(String id) {
		for (Register register : registers) {
			if(register!= null && register.getId().equals(id)  ) {
				return( register);
			}
		}
		return(null);
	}

	@Override
	public Register[] getAllUsers() {
		// TODO Auto-generated method stub
		return registers;	
	}

	@Override
	public String deleteUserById(String id) {
		int count1 = 0;
		for (Register register : registers) {
			
			if(register!= null && register.getId().equals(id)  ) {
				System.arraycopy(registers, count1+1, registers, count1, registers.length-count1-1);
				registers[registers.length-1] = null;
				return("Completed");
			}
			count1++;
		}
		
		return("Not Completed");
	}
	
}


