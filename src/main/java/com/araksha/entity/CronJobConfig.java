package com.araksha.entity;

import org.joda.time.DateTime;

/**
 * Created by saurabh on 21/8/18.
 */
public class CronJobConfig {


    private String timeToStart;
    private String frequency;
    //deactivate for the day
    private boolean isActive;
    //if false deactivate cron job for the day
    private boolean isComing;


}
