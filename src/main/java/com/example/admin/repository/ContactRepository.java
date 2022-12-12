package com.example.admin.repository;

import com.example.admin.dto.ContactDTO;
import com.example.admin.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public ArrayList<ContactDTO> contactList(){
        return mapper.contactList();
    }
}
