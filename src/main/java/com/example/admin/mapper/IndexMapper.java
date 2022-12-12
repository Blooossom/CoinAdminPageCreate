package com.example.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexMapper {

    public double amountPayment();
    public int cntMember();
    public int cntBuy();
    public int cntContact();

}
