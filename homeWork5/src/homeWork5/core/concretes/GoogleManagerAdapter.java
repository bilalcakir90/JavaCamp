package homeWork5.core.concretes;

import homeWork5.core.abstracts.LoginService;
import homeWork5.entities.concretes.User;
import homeWork5.googleService.GoogleLoginManager;
import homeWork5.googleService.GoogleRegisterManager;

public class GoogleManagerAdapter implements LoginService {
	
	private GoogleLoginManager googleLoginManager;
	private GoogleRegisterManager googleRegisterManager;

	@Override
	public void loginToSystem(User user) {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.login(user.getName(), user.getSurname(), user.getEmail(), user.getPassword());
		
	}

	@Override
	public void registerToSystem(User user) {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.register(user.getName(), user.getSurname(), user.getEmail(), user.getPassword());
		
	}

}
