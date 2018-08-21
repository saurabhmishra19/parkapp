package com.araksha.controllers;

import com.araksha.entity.CronJobConfig;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saurabh on 21/8/18.
 */
public class AppConfigController {


    @GetMapping(value="/cronjob")
    public CronJobConfig getCronJobConfig(String uuid){
        //response Time to
        return null;
    }


}
