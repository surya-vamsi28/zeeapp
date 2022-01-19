package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Register;

public class UserRepository {

	
	private Register[] registers = new Register[10];
	private static int count = -1;
	private UserRepository() {
		
	}
	//to return all the details of the user
	public Register[] getUsers() {
		return registers;
		
	}
	private static UserRepository userRepository;
	public static UserRepository getInstance() {
		if(userRepository==null)
			userRepository = new UserRepository();
		return userRepository;
	}
	public String addUser(Register register) {
		if(count == registers.length-1) {
			Register temp[] = new Register[registers.length*2];
			
			System.arraycopy(registers, 0, temp, 0, registers.length);
			registers = temp;
			registers[++count] = register;
			return "array is full";
		}
		registers[++count] = register;
		return "success";
		}

		//this method should return the user details based on id
	public Register getUserById(String id) 
	{
		for (Register register : registers) {
			if(register!= null && register.getId().equals(id)  ) {
				return( register);
			}
		}
		return(null);
	}
	
	
	public String updateUser(String id ,  Register register1) {
		int count1 = 0;
		for (Register register : registers) {
			if(register!= null && register.getId().equals(id)) {
				registers[count1] = register1;
				return("Completed");
			}
			count1++;
			
		}
		return("Not Completed");
		
	}

	public String deleteUser(String id) {
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
	
	


