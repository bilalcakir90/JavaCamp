package homeWork5.business.concretes;


import homeWork5.business.abstracts.UserService;
import homeWork5.core.abstracts.EmailCheckService;
import homeWork5.core.abstracts.EmailSendService;
import homeWork5.core.abstracts.LoginService;
import homeWork5.dataAccess.abstracts.UserDao;
import homeWork5.entities.concretes.User;

public class UserManager implements UserService{
	
	private EmailCheckService emailCheckService;
	private LoginService loginService;
	private UserDao userDao;
	private EmailSendService emailSendService;

	public UserManager(EmailCheckService emailCheckService, LoginService loginService, UserDao userDao,
			EmailSendService emailSendService) {
		super();
		this.emailCheckService = emailCheckService;
		this.loginService = loginService;
		this.userDao = userDao;
		this.emailSendService = emailSendService;
	}

	@Override
	public void login(User user) {
		if (emailCheckService.emailCheck(user.getEmail()) && emailIsItUsed(user.getEmail())!=true && user.getPassword()!=null) 
		{
			this.loginService.loginToSystem(user);
			
		} else {
			
			System.out.println(user.getName()+" "+user.getSurname()+" isimli kullanýcýnýn giriþi baþarýsýz!");

		}
		
		
		
		
	}

	@Override
	public void register(User user) {
		if (emailCheckService.emailCheck(user.getEmail()) 
				&& user.getName().length()>=2 && user.getSurname().length()>=2 
				&& user.getPassword().length()>=6 && emailIsItUsed(user.getEmail())) {
			this.loginService.registerToSystem(user);
			this.userDao.add(user);
			this.userDao.addEmail(user);
			this.emailSendService.emailSend(user.getEmail());
			
		} else {
			System.out.println(user.getName()+" "+user.getSurname()+" isimli kullanýcýnýn giriþi baþarýsýz!");

		}
		
	}

	@Override
	public boolean emailIsItUsed(String email) {
		
		boolean result = false;
		if (userDao.getEmail().contains(email)) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}

	

}
