package com.example.admin.controller;

import com.example.admin.dto.PaymentDTO;
import com.example.admin.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PaymentController {


    @Autowired
    PaymentService ps;

    @GetMapping("/selectPayment")
    public ArrayList<PaymentDTO> paymentList(){
        return ps.paymentList();
    }
}
