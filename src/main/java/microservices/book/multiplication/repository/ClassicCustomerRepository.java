package microservices.book.multiplication.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import microservices.book.multiplication.entity.Customer;

@Repository 
public class ClassicCustomerRepository { 

   @PersistenceContext EntityManager em; 

   public List<Customer> findByName(String name) { 
      TypedQuery<Customer> q = getEntityManger().createNamedQuery("searchCustomerByName", Customer.class); 

      q.setParameter("name", name);

      return q.getResultList();
   }

	public EntityManager getEntityManger() {
		// TODO Auto-generated method stub
		return em;
	}
}