package com.araksha.service.dataCache;

import com.araksha.entity.EmployeeLocation;

import java.util.Comparator;

public class ActiveEmployeeComparator implements Comparator<EmployeeLocation> {

    @Override
    public int compare(EmployeeLocation a, EmployeeLocation b){
        if(a.getEmpId()==b.getEmpId()){
            return 0;
        }
        return a.getTimeToReachOffice()<b.getTimeToReachOffice()?1:-1;
    }

}
