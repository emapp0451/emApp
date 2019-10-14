package com.easymove.emApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.easymove.emApp.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
