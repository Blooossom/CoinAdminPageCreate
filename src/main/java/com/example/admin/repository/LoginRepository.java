package com.example.admin.repository;


import com.example.admin.dto.LoginDTO;
import com.example.admin.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {

    @Autowired
    LoginMapper mapper;

    public LoginDTO login(LoginDTO loginDTO){
        return mapper.login(loginDTO);
    }
}
