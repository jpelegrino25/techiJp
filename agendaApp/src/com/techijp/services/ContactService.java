/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techijp.services;

import com.techijp.entities.Contact;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Quantum1
 */
public class ContactService {
    
    private List<Contact> contacts;
    public static int SEQUENCE=0;

    public ContactService() {
        contacts=new ArrayList<>();
    }   
    
    
    public List<Contact> findAll() {
        Collections.sort(contacts);
        return contacts;
    }
    
    public void AddContact(Contact contact) {
        SEQUENCE++;
        contact.setId(SEQUENCE);
        contacts.add(contact);
    }
    
    public void updateContact(Contact contact) {
        contacts.remove(contact);
        contacts.add(contact);
    }
    
    public Contact findContactByName(String firstName, String lastName) {
        for(Contact contact: contacts) {
            if(contact.getFirstName().equals(firstName)
                    && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }
    
    public List<Contact> findByCriteria(String criteria) {
       List<Contact> contactList=new ArrayList();
       
       for(Contact contact : contacts) {
           if(contact.toString().contains(criteria)){
               contactList.add(contact);
           }
       }
       
       return contactList;
    }
    
    
    public void buildContactValues() {       
        
        AddContact(new Contact("Juan", "Martinez", "809-741-2365"));
        AddContact(new Contact("Pedro", "Gonzalez", "809-200-2365"));
        AddContact(new Contact("Carlos", "Rodriguez", "809-333-2365"));
        AddContact(new Contact("Jose", "Rodriguez", "809-333-2365"));
        AddContact(new Contact("Rafael", "", "809-333-2365"));
    }
    
    
    
    
}
