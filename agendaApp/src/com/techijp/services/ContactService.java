/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techijp.services;

import com.techijp.entities.Contact;
import java.util.ArrayList;
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
    
    
    
    
    
    
    
}
