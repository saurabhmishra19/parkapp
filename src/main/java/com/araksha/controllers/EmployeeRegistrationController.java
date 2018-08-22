package com.araksha.controllers;

import com.araksha.entity.EmployeeResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.araksha.entity.Employee;
import com.araksha.service.EmployeeService;

@RestController
public class EmployeeRegistrationController {

	@Autowired
	EmployeeService employeeService;
	
	@PutMapping( value="/emp/add")
	public EmployeeResponseDto register(@RequestBody Employee employee) {
		return employeeService.addUser(employee);
	}
	@DeleteMapping( value="/emp/delete/empId/{empId}")
	public void deleteEmpByEmpID(@PathVariable String empId){employeeService.deleteUserByEmpId(empId);
	}

	@DeleteMapping( value="/emp/delete/{ID}")
	public void deleteEmpByID(@PathVariable String ID){employeeService.deleteUser(ID);
	}
}
