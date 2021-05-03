
public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirstName()  + " " +user.getLastName() + " isimli kullan�c� sisteme ba�ar�l� �ekilde eklendi.");
		
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "isim ve soyismi ile kullan�c� ba�ar�l� �ekilde silindi.");
	}
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			
			add(user);
			
		}
		
	}

}
