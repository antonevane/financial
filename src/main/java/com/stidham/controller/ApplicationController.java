package com.stidham.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stidham.services.ContactService;

/**
 * Created by drewjocham on 4/18/16.
 */
@Controller
public class ApplicationController {


    @Autowired
    ContactService contactService;

    @RequestMapping(value="/myaction", method= RequestMethod.POST)
    public String contactSubmit() throws IOException {

        System.out.println("Inside POST in Application Controller");

        return "index";
    }


}
