package com.example.admin.service;

import com.example.admin.dto.PaymentDTO;
import com.example.admin.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository pr;

    public ArrayList<PaymentDTO> paymentList(){
        return pr.paymentList();
    }
}
