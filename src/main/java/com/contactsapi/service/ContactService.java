package com.contactsapi.service;

import com.contactsapi.model.Contact;
import com.contactsapi.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    public Contact getContactById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public Contact createContact(Contact contact) {
        return repository.save(contact);
    }

    public Contact updateContact(UUID id, Contact updated) {
        if (!repository.existsById(id)) {
            return null;
        }
        updated.setId(id);
        return repository.save(updated);
    }

    public boolean deleteContact(UUID id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
