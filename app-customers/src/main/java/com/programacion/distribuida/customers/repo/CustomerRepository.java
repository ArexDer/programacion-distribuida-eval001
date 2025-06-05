package com.programacion.distribuida.customers.repo;

import com.programacion.distribuida.customers.db.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class CustomerRepository implements PanacheRepositoryBase<Customer, Integer> {

    public List<Customer> findByIdCustomer(Integer id) {
        return this.list(
                "select i.customer from Customer i where i.id=?1",
                id
        );
    }
}
