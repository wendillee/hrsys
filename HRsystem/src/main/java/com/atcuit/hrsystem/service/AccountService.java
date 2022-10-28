package com.atcuit.hrsystem.service;

import com.atcuit.hrsystem.pojo.Account;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @date 2022/10/3 - 14:50
 */
public interface AccountService {

    /**
     * 返回登录状态
     * 1.登录成功
     * 2.密码错误
     * 3.用户不存在
     * 4.首次登陆
     * @return
     */
    String getLoginStatus(Integer accountNum, String password);

    /**
     * 首次登陆重置密码,并将logged置为1
     */
    void passwordReset(Account account);

    /**
     * 根据账号查询员工姓名
     */
    String getUserNameByAccountNum(Integer accountNum);
}
