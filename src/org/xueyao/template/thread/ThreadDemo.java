package org.xueyao.template.thread;
/**
 * @author Yao Xue
 * @date Aug 3, 2017 4:12:40 PM
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //匿名内部类r表示任务类对象
        Runnable r = new Runnable() {
            @Override
            public void run() {
                //书写任务
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"---"+i);
                }
            }
        };
        
        //创建线程类对象 
        new Thread(r,"小明").start();
        new Thread(r,"小红").start();
    }
}



