package com.example.admin.repository;

import com.example.admin.dto.PaymentDTO;
import com.example.admin.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper mapper;

    public ArrayList<PaymentDTO> paymentList(){
        return mapper.paymentList();
    }
}
