package com.araksha.repository;

import com.araksha.entity.Employee;
import com.araksha.entity.LogTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeLoginTimeRepository extends MongoRepository<LogTime, String> {



}
