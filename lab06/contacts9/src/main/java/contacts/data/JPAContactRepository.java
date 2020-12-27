package contacts.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import contacts.Contact;

@Repository
@Transactional
public class JPAContactRepository implements ContactRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Contact> findContacts(long max, int count) {
		return (List<Contact>) 
				em.createQuery("select c from Contact c where id > ? ORDER by id asc")
				.setParameter(1, max).getResultList();
	}
	
	@Override
	public Contact findOne(long id) {
		return em.find(Contact.class, id);
	}
	
	@Override
	public void insert(Contact contact) {
		em.persist(contact);
	}
	
	@Override
	public void update(Contact contact) {
		em.merge(contact);
	}

	@Override
	public void delete(long id) {
		Contact contact = em.find(Contact.class, id);
		em.remove(contact);		
	}
	
}
