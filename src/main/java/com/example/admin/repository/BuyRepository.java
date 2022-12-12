package com.example.admin.repository;

import com.example.admin.dto.BuyDTO;
import com.example.admin.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BuyRepository {

    @Autowired
    BuyMapper mapper;

    public ArrayList<BuyDTO> buyList(){
        return mapper.buyList();
    }
}
