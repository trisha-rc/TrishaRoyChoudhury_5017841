public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String findCustomer(String id) {
        return customerRepository.findCustomerById(id);
    }
}
