package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerServices{

	@Override
	public  void save(Customer customer) {
		System.out.println("Sate to DB :" + customer.getFirstName());
		
	}

}
