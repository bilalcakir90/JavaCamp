package hm4;

import java.io.Console;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concerete.NeroCustomerManager;
import Concerete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.setFirstName("BÝLAL");
		customer.setLastName("ÇAKIR");
		customer.setNationalityId("33290135220");
		customer.setBirthDate(LocalDate.of(1990,7,11));
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager (new MernisServiceAdapter());
		customerManager2.save(customer);
		
		

	}

}
