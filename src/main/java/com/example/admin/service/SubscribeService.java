package com.example.admin.service;


import com.example.admin.dto.SubscribeDTO;
import com.example.admin.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository sr;

    public ArrayList<SubscribeDTO> subscribeList(){
        return sr.subscribeList();
    }
}
