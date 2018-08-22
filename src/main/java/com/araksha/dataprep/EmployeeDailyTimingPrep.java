package com.araksha.dataprep;

import com.araksha.entity.LogTime;
import org.joda.time.DateTime;

import java.util.*;

/**
 * Created by saurabh on 21/8/18.
 */
public class EmployeeDailyTimingPrep {

    public static List<LogTime> mockLoginTimingsPrep(List<String> emps, int numberOfMonths) {

        DateTime startDay = new DateTime().minusDays(numberOfMonths);
        //.minusMonths(numberOfMonths);
        DateTime current = new DateTime();
        System.out.println(current);
        Random rnd = new Random(123);
        List<LogTime> logs = new ArrayList<>();
        for (; !(startDay.dayOfMonth().get() == current.dayOfMonth().get() &&
                startDay.monthOfYear().get() == current.monthOfYear().get());
             startDay = startDay.plusDays(1)) {

            for (String st : emps) {

                int inTimeMin = rnd.nextInt(60);

                int inTimeHr = rnd.nextInt(13);
                inTimeHr = (inTimeHr > 4 && inTimeHr <= 8 && inTimeHr == 0) ? inTimeHr + 4 : inTimeHr;

                inTimeHr = inTimeHr < 7 ? inTimeHr + 12 : inTimeHr;

                DateTime startTime = new DateTime(startDay.year().get(), startDay.monthOfYear().get(), startDay.dayOfMonth().get(), inTimeHr, inTimeMin);
                int timeTake = rnd.nextInt(80);
                timeTake = timeTake < 15 ? timeTake + 15 : timeTake;
                DateTime inTime = startTime.plusMinutes(timeTake);


                //   System.out.println(startTime);
                LogTime tm = new LogTime();
                tm.setEmpId(st);
                tm.setStartTime(startTime.getMillis());
                tm.setInTime(inTime.getMillis());
                tm.setMinutesTaken(timeTake);
                tm.setDay(startDay.getMillis());
                logs.add(tm);

            }
        }
        return logs;
    }

    public static void main(String[] args) {
        System.out.println(mockLoginTimingsPrep(Arrays.asList(new String[]{"123", "234"}), 4));
    }


}
