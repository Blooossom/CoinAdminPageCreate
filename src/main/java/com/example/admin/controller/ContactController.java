package com.example.admin.controller;

import com.example.admin.dto.ContactDTO;
import com.example.admin.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ContactController {

    @Autowired
    ContactService cs;

    @GetMapping("/selectContact")
    public ArrayList<ContactDTO> contactList(){
        return cs.contactList();
    }



}
