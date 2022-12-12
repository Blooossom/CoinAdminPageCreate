package com.example.admin.controller;

import com.example.admin.service.BuyService;
import com.example.admin.service.ContactService;
import com.example.admin.service.IndexService;
import com.example.admin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    IndexService is;


    @GetMapping("/selectCntMember")
    public int cntMember(){
        return is.cntMember();
    }

    @GetMapping("/selectCntBuy")
    public int cntBuy(){
        return is.cntBuy();
    }
    @GetMapping("/selectCntContact")
    public int cntContact(){
        return is.cntContact();
    }
    @GetMapping("/selectAmountPayment")
    public double amountPayment(){
        return is.amountPayment();
    }

}
