package com.prospring4.ch13.integrationTest;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    Contact findByFirstNameAndLastName(String firstName, String lastName);
}
