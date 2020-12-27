package contacts.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import contacts.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>, ContactsFind {

	List<Contact> findContacts(long max, int count);
}