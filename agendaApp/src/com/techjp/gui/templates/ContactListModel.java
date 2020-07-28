/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techjp.gui.templates;

import com.techijp.entities.Contact;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Quantum1
 */
public class ContactListModel extends AbstractListModel<String> {
    
    private List<Contact> contactList;

    public ContactListModel(List<Contact> contactList) {
        this.contactList = contactList;
    }
    
    

    @Override
    public int getSize() {
        return contactList.size();
    }

    @Override
    public String getElementAt(int index) {
        return contactList.get(index).toString();
    }
    
}
