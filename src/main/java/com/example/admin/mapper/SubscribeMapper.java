package com.example.admin.mapper;


import com.example.admin.dto.SubscribeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface SubscribeMapper {

    public ArrayList<SubscribeDTO> subscribeList();
}
