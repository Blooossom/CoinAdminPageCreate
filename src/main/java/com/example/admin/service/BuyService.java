package com.example.admin.service;

import com.example.admin.dto.BuyDTO;
import com.example.admin.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BuyService {

    @Autowired
    BuyRepository br;

    public ArrayList<BuyDTO> buyList(){
        return br.buyList();
    }
}
