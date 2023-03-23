package edu.iu.c322.democustomerservice.repository;
import java.util.ArrayList;
import java.util.List;
import edu.iu.c322.democustomerservice.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    public List<Customer> findAll(){
        return customers;
    }
    public int create(Customer customer){
        int id = customers.size()+1;
        customer.setId(id);
        customers.add(customer);
        return id;
    }
    public void update(Customer customer, int id){
        Customer x = getCustomerById(id);
        if(x!=null){
            x.setName(customer.getName());
            x.setEmail(customer.getEmail());

        }
    }
    public void delete(int id){
        Customer x = getCustomerById(id);
        if (x!=null){
            customers.remove(x);
        } else {
            throw new IllegalStateException("customer with this id was not found.");
        }
    }

    private Customer getCustomerById(int id){
        return customers.stream().filter(x->x.getId()==id).findAny().orElse(null);
    }
}
