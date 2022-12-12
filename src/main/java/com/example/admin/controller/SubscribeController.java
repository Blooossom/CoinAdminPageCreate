package com.example.admin.controller;

import com.example.admin.dto.SubscribeDTO;
import com.example.admin.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SubscribeController {

    @Autowired
    SubscribeService ss;

    @GetMapping("/selectSubscribe")
    public ArrayList<SubscribeDTO> subscribeList(){
        return ss.subscribeList();
    }


}
