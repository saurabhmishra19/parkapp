package com.araksha.repository;

import com.araksha.entity.EmployeeResponseDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.araksha.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

	@Query("{empId:'?0'}")
	List<EmployeeResponseDto> findByEmpId(String empId);


	@Query("{_id:'?0'}")
	EmployeeResponseDto findBy_id(String _id);
}
