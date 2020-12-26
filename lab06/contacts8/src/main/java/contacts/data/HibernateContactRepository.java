package contacts.data;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import contacts.Contact;

@Repository
@Transactional
public class HibernateContactRepository implements ContactRepository {
		
		private SessionFactory sessionFactory;
		
		@Inject
		public HibernateContactRepository(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		private Session currentSession() {
			return sessionFactory.getCurrentSession();
		}
		
		@Override
		public List<Contact> findContacts(long max, int count) {
			return (List<Contact>) currentSession().createCriteria(Contact.class).list();
		}
		
		@Override
		public Contact findOne(long id) {
			return (Contact) currentSession().get(Contact.class, id);
		}
		
		@Override
		public void insert(Contact contact) {
			currentSession().save(contact);
		}
		
		@Override
		public void update(Contact contact) {
			currentSession().update(contact);
		}

		@Override
		public void delete(long id) {
			Contact contactToDelete = (Contact) currentSession().load(Contact.class, id);
			currentSession().delete(contactToDelete);
		}
}

