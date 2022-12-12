package com.example.admin.mapper;

import com.example.admin.dto.LoginDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    public LoginDTO login(LoginDTO loginDTO);
}
