package com.atcuit.hrsystem.controller;

import com.atcuit.hrsystem.pojo.Account;
import com.atcuit.hrsystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shkstart
 * @date 2022/10/3 - 12:14
 */
@Controller
public class LoginController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public void login(@RequestBody Account account, HttpServletResponse response) throws IOException {
        //目标页面：默认为成功登录跳转
        String target = "success";
        //接收登录状态
        String loginStatus = accountService.getLoginStatus(account.getAccountNum(), account.getPassword());
//        System.out.println(loginStatus);

        response.getWriter().write(loginStatus);
    }

    @RequestMapping(value = "login/topswreset/{accountNum}")
    public String toPswRest(@PathVariable("accountNum") Integer accountNum, Model model) {
//        System.out.println(accountNum);
        //展示账号
        model.addAttribute("accountNum", accountNum);
        return "login/pswreset";
    }


    @RequestMapping(value = "login/pswreset", method = RequestMethod.POST)
    public String pswRest(Account account) {
        //重置密码
        accountService.passwordReset(account);
        return "login/login";
    }


}
