package com.example.admin.mapper;

import com.example.admin.dto.PaymentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PaymentMapper {

    public ArrayList<PaymentDTO> paymentList();
}
