package com.contactsapi.controller;

import com.contactsapi.model.Contact;
import com.contactsapi.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable UUID id) {
        Contact contact = service.getContactById(id);
        return contact != null
                ? ResponseEntity.ok(contact)
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        Contact created = service.createContact(contact);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable UUID id, @RequestBody Contact updated) {
        Contact result = service.updateContact(id, updated);
        return result != null
                ? ResponseEntity.ok(result)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable UUID id) {
        boolean deleted = service.deleteContact(id);
        return deleted
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
