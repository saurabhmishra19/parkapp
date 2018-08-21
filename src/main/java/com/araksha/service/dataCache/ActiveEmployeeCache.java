package com.araksha.service.dataCache;

import com.araksha.entity.EmployeeLocation;
import org.springframework.stereotype.Component;

import java.util.PriorityQueue;
@Component
public class ActiveEmployeeCache {

    public static PriorityQueue<EmployeeLocation> activeEmployeeCache = new PriorityQueue<>(new ActiveEmployeeComparator());

    public void enqueue(EmployeeLocation empLoc){

        activeEmployeeCache.add(empLoc);
    }

    public EmployeeLocation dequeue(EmployeeLocation empLoc){

        return activeEmployeeCache.peek();
    }






}
