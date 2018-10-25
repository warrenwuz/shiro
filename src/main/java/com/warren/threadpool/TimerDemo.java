package com.warren.threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author wz
 * @since 1.11
 * Timer 因为实现是单线程实现的，在多任务的时候非常影响性能
 */
@Slf4j
public class TimerDemo extends TimerTask {

    private String taskName;

    public TimerDemo(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (Exception E){

        }
        log.info("task run"+taskName);
    }

    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.schedule(new TimerDemo("task1"),1000,1000);
        timer.schedule(new TimerDemo("task2"),2000,2000);
    }
}
