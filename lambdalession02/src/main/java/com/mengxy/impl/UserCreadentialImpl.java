package com.mengxy.impl;


import com.mengxy.IUserCredential;

public class UserCreadentialImpl  {

    public static void main(String[] args) {

        //使用lambda表达式
        IUserCredential ic2 = (String username)->{
            return "111";
        };
        System.out.println(ic2.verfiyUser("111"));
    }


}
