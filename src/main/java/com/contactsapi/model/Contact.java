package com.contactsapi.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Contact {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String phoneNumber;

    private String email;

    @ElementCollection
    private List<String> tags;

    public Contact() {
    }

    public Contact(UUID id, String name, String phoneNumber, String email, List<String> tags) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.tags = tags;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
