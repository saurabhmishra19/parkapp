package com.araksha.service;

import com.araksha.entity.Employee;
import com.araksha.entity.EmployeeResponseDto;

import java.util.List;

public interface EmployeeService {

	public EmployeeResponseDto addUser(Employee employee);
	public EmployeeResponseDto getUser(String empId);
	public EmployeeResponseDto getUserById(String uuid) ;
}
