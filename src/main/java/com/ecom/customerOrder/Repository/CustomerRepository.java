package com.ecom.customerOrder.Repository;

import com.ecom.customerOrder.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }
