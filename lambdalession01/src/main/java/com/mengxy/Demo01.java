package com.mengxy;

public class Demo01 {
    /**
     * 传统创建线程的方式
     * @param args
     */
    public static void main(String[] args) {
        //传统模式下，新线程的创建
        new Thread(new Runnable() {
            public void run() {
                System.out.println("threading..."+Thread.currentThread().getId());
            }
        }).start();

        //Jdk8,lambda表达式优化线程
        new Thread(()->{
            System.out.println("lambda threading..."+Thread.currentThread().getId());
        }).start();

    }


}
