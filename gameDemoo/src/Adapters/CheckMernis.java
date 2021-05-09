package Adapters;

import Abstract.CheckUserService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckMernis implements CheckUserService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result;
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthDate().getYear());
		}catch (Exception e){
			result=false;
			System.out.println("Mernis sistemi þuanda çalýþmamaktadýr.");
		}
		return result;
	}

}
