package pl.bal.konrad;

public class CustomerRepoImpl implements CustomerRepository {

	public Customer getCustomer(long customerId) {
		return null;
	}

	public String getCustomername(long customerId) {
		return "Konrad";
	}

	public void addCustomer(Customer customer) {
		if (customer.getName() == null) {
			throw new RuntimeException("Customer Name can't be null");
		}
		System.out.println("Customer "+ customer.getName() +" saved");

	}
}
