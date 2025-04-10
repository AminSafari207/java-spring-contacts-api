package com.contactsapi.service;

import com.contactsapi.model.Contact;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContactService {
    private final Map<UUID, Contact> contactMap = new LinkedHashMap<>();

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contactMap.values());
    }

    public Contact getContactById(UUID id) {
        return contactMap.get(id);
    }

    public Contact createContact(Contact contact) {
        UUID id = UUID.randomUUID();
        contact.setId(id);
        contactMap.put(id, contact);
        return contact;
    }

    public Contact updateContact(UUID id, Contact updated) {
        if (!contactMap.containsKey(id)) {
            return null;
        }
        updated.setId(id); // keep original ID
        contactMap.put(id, updated);
        return updated;
    }

    public boolean deleteContact(UUID id) {
        return contactMap.remove(id) != null;
    }
}
