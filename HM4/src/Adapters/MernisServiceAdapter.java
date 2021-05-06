package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result;
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDate().getYear());
		} catch (Exception e) {
			result=false;
			System.out.println("Mernis sistemenine baðlanamadý.");
		}
		return result;
				
		
	}

	private KPSPublicSoap KPSPublicSoap() {
		// TODO Auto-generated method stub
		return null;
	}

}
