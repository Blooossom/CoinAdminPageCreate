package com.example.admin.service;

import com.example.admin.repository.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
    @Autowired
    IndexRepository ir;

    public double amountPayment(){
        return ir.amountPayment();
    }
    public int cntMember(){
        return ir.cntMember();
    }
    public int cntBuy(){
        return ir.cntBuy();
    }
    public int cntContact(){
        return ir.cntContact();
    }
}
