package com.example.admin.repository;

import com.example.admin.dto.MemberDTO;
import com.example.admin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public ArrayList<MemberDTO> memberList(){
        return mapper.memberList();
    }
}
