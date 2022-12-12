package com.example.admin.repository;


import com.example.admin.dto.SubscribeDTO;
import com.example.admin.mapper.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper mapper;

    public ArrayList<SubscribeDTO> subscribeList(){
        return mapper.subscribeList();
    }
}
