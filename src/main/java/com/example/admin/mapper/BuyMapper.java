package com.example.admin.mapper;

import com.example.admin.dto.BuyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BuyMapper {


    public ArrayList<BuyDTO> buyList();
}
