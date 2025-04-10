package com.contactsapi.model;

import java.util.List;
import java.util.UUID;

public class Contact {
    private UUID id;
    private String name;
    private String phoneNumber;
    private String email;
    private List<String> tags;

    public Contact() {
        // No-arg constructor required by Spring (Jackson)
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
