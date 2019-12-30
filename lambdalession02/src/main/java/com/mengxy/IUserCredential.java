package com.mengxy;

/**
 * 用户身份验证接口
 */

public interface IUserCredential {
    /**
     * 通过用户账号，验证用户身份信息的接口
     * @param  username
     * @return 返回身份信心[系统管理员、用户管理员、普通用户]
     */
    String verfiyUser(String name);

    default String checkUser(String name){
        if ("admin".equals(name)){
            return "系统管理员";
        }if("manager".equals("普通管理员")){
            return "普通管理员";
        }else{
            return "普通会员";
        }
    }
}
