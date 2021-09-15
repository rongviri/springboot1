package microservices.book.multiplication.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import microservices.book.multiplication.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	  Customer findByEmail(String email);

	  List<Customer> findByName(String name, Sort sort);

	  Page<Customer> findByName(String name, Pageable pageable);
}
