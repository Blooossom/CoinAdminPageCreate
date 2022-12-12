package com.example.admin.page.controller;

import com.example.admin.dto.LoginDTO;
import com.example.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @Autowired
    LoginService ls;

    @GetMapping("/")
    public String goLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(LoginDTO loginDTO, HttpSession session){
        if (session.getAttribute("id") != null) {
            return "index";
        }else{
            ls.login(loginDTO);
            session.setAttribute("id", loginDTO.getId());
            return "index";
        }
    }

    @GetMapping("/goContact")
    public String goContact(){
        return "contactList";
    }

    @GetMapping("/goMember")
    public String goMember(){
        return "memberList";
    }

    @GetMapping("/goSubscribe")
    public String goSubscribe(){
        return "subscribeList";
    }

    @GetMapping("/goBuy")
    public String goBuy(){
        return "buyList";
    }
    @GetMapping("/goPayment")
    public String goPayment(){
        return "paymentList";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        if (session.getAttribute("id") == null) {
            return "login";
        }else{
            session.setAttribute("id",null);
            return "login";
        }
    }


}
