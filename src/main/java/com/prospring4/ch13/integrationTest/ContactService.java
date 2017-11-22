package com.prospring4.ch13.integrationTest;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact findByFirstNameAndLastName(String firstName, String lastName);
    Contact save(Contact contact);
    void delete(Contact contact);
}
