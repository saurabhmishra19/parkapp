package com.araksha.controllers;

import com.araksha.entity.EmployeeLocation;
import com.araksha.entity.LocationUpdaterServiceResponse;
import com.araksha.service.EmployeeService;
import com.araksha.service.LocationUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationUpdateController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    LocationUpdateService locationUpdateService;

    @PostMapping(value = "/locationUpdate")
    public LocationUpdaterServiceResponse updateLocation(@RequestBody EmployeeLocation empLocation) {
        if (employeeService.getUserById(empLocation.getId()) != null) {
           return  locationUpdateService.locationUpdater(empLocation);
        }
        return null;
    }
}
