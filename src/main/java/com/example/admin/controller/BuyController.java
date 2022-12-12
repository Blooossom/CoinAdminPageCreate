package com.example.admin.controller;

import com.example.admin.dto.BuyDTO;
import com.example.admin.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BuyController {

    @Autowired
    BuyService bs;

    @GetMapping("/selectBuy")
    public ArrayList<BuyDTO> buyList(){
        return bs.buyList();
    }
}
