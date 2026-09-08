package com.shashi.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashi.portfolio.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}