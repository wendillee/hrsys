package com.atcuit.hrsystem.controller;


import com.atcuit.hrsystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author shkstart
 * @date 2022/10/6 - 11:49
 */
@Controller
public class HomeController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/toBOSSHome/{accountNum}")
    public String toBOSSHome(@PathVariable("accountNum") Integer accountNum, HttpSession session){
        String userName = accountService.getUserNameByAccountNum(accountNum);
        session.setAttribute("accountNum",accountNum);
        session.setAttribute("userName", userName);
        return "home/BOSSHome";
    }
}
