package com.example.admin.mapper;

import com.example.admin.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface MemberMapper {

    public ArrayList<MemberDTO> memberList();
}
