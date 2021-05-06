package Concerete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends  BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		 this.customerCheckService=customerCheckService;
	
	}
	
	@Override
	
	
	public void save(Customer customer) {
		
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+customer.getLastName()+" saved to DB");
		}
		else {
			System.out.println("not a valid person");
		}
	}
	
	

}
