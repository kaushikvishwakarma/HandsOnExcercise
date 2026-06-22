package DependencyInjectionExample;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void showCustomer(int id) {
        System.out.println(customerRepository.findCustomerById(id));
    }
}
