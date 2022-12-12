package com.example.admin.service;


import com.example.admin.dto.LoginDTO;
import com.example.admin.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository lr;

    public LoginDTO login(LoginDTO loginDTO){
        return lr.login(loginDTO);
    }
}
