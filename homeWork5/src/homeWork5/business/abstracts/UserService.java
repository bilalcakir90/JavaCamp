package homeWork5.business.abstracts;

import homeWork5.entities.concretes.User;

public interface UserService {
	
	void login(User user);
	void register(User user);
	boolean emailIsItUsed (String email);
	
	

}
