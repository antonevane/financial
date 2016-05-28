package com.stidham.services;

import com.stidham.model.Contact;
import com.stidham.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by drewjocham on 4/20/16.
 */
@Service
public class ContactService {

    @Autowired
    ContactFormRepository contactFormRepository;

    public void saveContact(Contact contact){
        contactFormRepository.save(contact);
    }

}
