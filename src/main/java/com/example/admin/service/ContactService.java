package com.example.admin.service;


import com.example.admin.dto.ContactDTO;
import com.example.admin.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContactService {

    @Autowired
    ContactRepository cr;

    public ArrayList<ContactDTO> contactList(){
        return cr.contactList();
    }
}
