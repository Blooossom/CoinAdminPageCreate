package com.example.admin.controller;

import com.example.admin.dto.MemberDTO;
import com.example.admin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MemberController {


    @Autowired
    MemberService ms;

    @GetMapping("/selectMember")
    public ArrayList<MemberDTO> memberList(){
        return ms.memberList();
    }
}
