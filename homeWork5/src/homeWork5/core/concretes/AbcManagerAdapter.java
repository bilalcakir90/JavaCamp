package homeWork5.core.concretes;

import homeWork5.abcService.AbcLoginManager;
import homeWork5.abcService.AbcRegisterManager;
import homeWork5.core.abstracts.LoginService;
import homeWork5.entities.concretes.User;

public class AbcManagerAdapter implements LoginService{
	private AbcLoginManager abcLoginManager;
	private AbcRegisterManager abcRegisterManager;
	

	@Override
	public void loginToSystem(User user) {
		AbcLoginManager abcLoginManager = new AbcLoginManager();
		abcLoginManager.login(user.getName(), user.getSurname(), user.getPassword(), user.getEmail());
		
	}

	@Override
	public void registerToSystem(User user) {
		AbcRegisterManager abcRegisterManager = new AbcRegisterManager();
		abcRegisterManager.register(user.getName(), user.getSurname(), user.getPassword(), user.getEmail());
		
	}

}
