package com.atcuit.hrsystem.mapper;

import com.atcuit.hrsystem.pojo.Account;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @date 2022/10/3 - 14:53
 */
public interface AccountMapper {
    /**
     * 根据accountNum查询account
     * @param accountNum
     * @return
     */
    Account getAccountByAccountNum(@Param("accountNum") Integer accountNum);

    /**
     * 首次登陆重置密码,并将logged置为1
     */
    void passwordReset(Account account);

    /**
     * 根据账号查询员工姓名
     */
    String getUserNameByAccountNum(@Param("accountNum") Integer accountNum);

}
