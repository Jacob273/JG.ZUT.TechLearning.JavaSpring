package contacts.data;

import java.util.List;

import contacts.Contact;

public interface ContactsFind {
	List<Contact> findContacts(long max, int count);
}
