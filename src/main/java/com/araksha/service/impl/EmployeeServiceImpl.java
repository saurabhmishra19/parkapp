package com.araksha.service.impl;

import com.araksha.entity.EmployeeResponseDto;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.araksha.entity.Employee;
import com.araksha.repository.EmployeeRepository;
import com.araksha.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponseDto addUser(Employee employee) {
        DateTime time=new DateTime();
        employee.setDateRegistered(time.getMillis());
        employee.setIsActive(true);

        if (employeeRepository.save(employee) != null) {
            List<EmployeeResponseDto> emp = employeeRepository.findByEmpId(employee.getEmpId());
            EmployeeResponseDto empOne=employeeRepository.findBy_id(emp.get(0).get_id());
            return empOne;
        }

        return null;
    }


    @Override
    public EmployeeResponseDto getUser(String empId) {
        List<EmployeeResponseDto> emp= employeeRepository.findByEmpId(empId);
        return emp.get(0);
    }


    @Override
    public EmployeeResponseDto getUserById(String uuid) {
        EmployeeResponseDto emp= employeeRepository.findBy_id(uuid);
        return emp;
    }

}
