package com.example.admin.mapper;

import com.example.admin.dto.ContactDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ContactMapper {

    public ArrayList<ContactDTO> contactList();
}
