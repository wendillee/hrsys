package com.atcuit.hrsystem.service.impl;

import com.atcuit.hrsystem.mapper.AccountMapper;
import com.atcuit.hrsystem.pojo.Account;
import com.atcuit.hrsystem.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shkstart
 * @date 2022/10/3 - 14:52
 */

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public String getLoginStatus(Integer accountNum, String password) {
        //调用mapper查询指定员工
        Account account = accountMapper.getAccountByAccountNum(accountNum);
//        System.out.println(account);
        //判断登录状态
        if(account==null) {
            //用户不存在
            return "3";
        }else if(!account.getPassword().equals(password)){
            //密码错误
            return "2";
        }else if(!account.isLogged()){
            //首次登陆
            return "4";
        }
        //登录成功
        return "1"+account.getGmlevel();
    }

    @Override
    public void passwordReset(Account account) {
        //将logged置为1
        account.setLogged(true);
        System.out.println(account);
        //调用mapper更新
        accountMapper.passwordReset(account);
    }

    /**
     * 根据账号查询员工姓名
     */
    public String getUserNameByAccountNum(Integer accountNum){
        String userName = accountMapper.getUserNameByAccountNum(accountNum);
        System.out.println("结构为"+userName);
        return userName;
    }
}
