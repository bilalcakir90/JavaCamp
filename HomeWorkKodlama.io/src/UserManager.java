
public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirstName()  + " " +user.getLastName() + " isimli kullanýcý sisteme baþarýlý þekilde eklendi.");
		
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "isim ve soyismi ile kullanýcý baþarýlý þekilde silindi.");
	}
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			
			add(user);
			
		}
		
	}

}
