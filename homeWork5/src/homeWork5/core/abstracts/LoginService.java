package homeWork5.core.abstracts;

import homeWork5.entities.concretes.User;

public interface LoginService {
	void loginToSystem (User user);
	void registerToSystem (User user);

}
