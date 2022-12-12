package com.example.admin.service;


import com.example.admin.dto.MemberDTO;
import com.example.admin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public ArrayList<MemberDTO> memberList(){
        return mr.memberList();
    }
}
