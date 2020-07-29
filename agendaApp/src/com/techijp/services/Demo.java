/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techijp.services;

import com.techijp.entities.Contact;
import java.util.List;


/**
 *
 * @author Quantum1
 */
public class Demo {
    
    public static void main(String[] args) {
        
        ContactService contactService=new ContactService();
        
        contactService.AddContact(new Contact("Juan", "Martinez", "809-741-2365"));
        contactService.AddContact(new Contact("Pedro", "Gonzalez", "809-200-2365"));
        contactService.AddContact(new Contact("Carlos", "Rodriguez", "809-333-2365"));
        contactService.AddContact(new Contact("Jose", "Rodriguez", "809-333-2365"));
        
        
        System.out.println("Before");
        List<Contact> list=contactService.findAll();
        System.out.println(list);
        
        Contact contactFound=contactService.findContactByName("Pedro", "Gonzalez");
        contactFound.setFirstName("Hadar");
        System.out.println(contactFound.getPhoneNumber());
        contactService.updateContact(contactFound);
        
        System.out.println("After");
        System.out.println(contactService.findAll());
        
    
        System.out.println("CRITERIA");
        System.out.println(contactService.findByCriteria("Rodrig"));
        
      
        
        
      
    }
    
}
