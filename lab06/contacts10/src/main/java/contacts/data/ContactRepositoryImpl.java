package contacts.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import contacts.Contact;

@Repository
@Transactional
public class ContactRepositoryImpl implements ContactsFind {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> findContacts(long max, int count) {
		return  (List<Contact>) em.createQuery("select c from Contact c where id > ? ORDERby id asc")
				.setParameter(1, max)
				.getResultList();
	}

}
