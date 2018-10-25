package com.warren.threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @author warren
 * @since  1.11
 */
@Slf4j
public class ScheduledExecutorDemo implements  Runnable {
    private String taskName;
    private Integer i =1;

    public ScheduledExecutorDemo(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        i++;
        /// 多线程并发执行，不会影响
       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        log.info("task run"+taskName);
        log.info("i="+i);
    }

    public static void main(String[] args) {
        //线程池长期维护的线程数,即使线程处于Idle状态,也不会回收
        Integer corePoolSize=10;
        //线程数的上限
        Integer maximumPoolSize=10;
        //大于corePoolSize的线程的idle时长,超过这个时间,多余的线程就会被回收
        Long keepAliveTime=10L;
        //时间类型
        TimeUnit timeUnit=TimeUnit.SECONDS;
        //等待的任务队列(阻塞队列)
        ArrayBlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<Runnable>(512);
        ScheduledExecutorService scheduledExecutorService=new ScheduledThreadPoolExecutor(10);
        scheduledExecutorService.scheduleAtFixedRate(new ScheduledExecutorDemo("task1"),5,5, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new ScheduledExecutorDemo("task2"),5,5, TimeUnit.SECONDS);
    }
}
