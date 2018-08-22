package com.araksha.controllers;

import com.araksha.dataprep.DummyEmployeePrep;
import com.araksha.dataprep.EmployeeDailyTimingPrep;
import com.araksha.entity.LogTime;
import com.araksha.repository.EmployeeLoginTimeRepository;
import com.araksha.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockDataPrepController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeLoginTimeRepository employeeLoginTimeRepository;

    @GetMapping(value = "/mockdata/users/{count}")
    public void prepMockData(@PathVariable int count){

        DummyEmployeePrep.prepDummyEmployes(count).forEach(
                emp->
                employeeRepository.save(emp)
        );


    }
    @GetMapping(value="/mockdata/userlogin/{numdays}")
    public void prepLoginMockData(@PathVariable int numdays){

        EmployeeDailyTimingPrep.mockLoginTimingsPrep( DummyEmployeePrep.empIds,numdays).forEach(
               log-> employeeLoginTimeRepository.save(log)
        );



    }






}
