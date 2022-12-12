package com.example.admin.repository;

import com.example.admin.mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IndexRepository {

    @Autowired
    IndexMapper mapper;

    public double amountPayment(){
        return mapper.amountPayment();
    }
    public int cntMember(){
        return mapper.cntMember();
    }
    public int cntBuy(){
        return mapper.cntBuy();
    }
    public int cntContact(){
        return mapper.cntContact();
    }
}
