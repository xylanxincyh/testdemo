package com.lanxin.log;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by cyh on 2018/4/24.
 */
@Configuration
@EnableScheduling
public class Log {

    @Scheduled(fixedDelay = 3000)
    public void log(){
        System.out.println("@!@");
    }
}
