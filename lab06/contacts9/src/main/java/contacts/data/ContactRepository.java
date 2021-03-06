package contacts.data;

import java.util.List;

import contacts.Contact;

public interface ContactRepository {

	List<Contact> findContacts(long max, int count);

	Contact findOne(long id);

	void insert(Contact contact);

	void update(Contact contact);
	
	void delete(long id);

}