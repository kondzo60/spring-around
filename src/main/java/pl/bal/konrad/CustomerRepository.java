package pl.bal.konrad;

public interface CustomerRepository {
	Customer getCustomer(long customerId);
	String getCustomername(long customerId);
	void addCustomer(Customer customer);
}
