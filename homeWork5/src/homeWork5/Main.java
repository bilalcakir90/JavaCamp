package homeWork5;

import homeWork5.business.abstracts.UserService;
import homeWork5.business.concretes.UserManager;
import homeWork5.core.abstracts.EmailCheckService;
import homeWork5.core.abstracts.EmailSendService;
import homeWork5.core.abstracts.LoginService;
import homeWork5.core.concretes.EmailCheckManager;
import homeWork5.core.concretes.EmailSendManagerAdapter;
import homeWork5.core.concretes.GoogleManagerAdapter;
import homeWork5.dataAccess.abstracts.UserDao;
import homeWork5.dataAccess.concretes.HibernateUserDao;
import homeWork5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User bilal = new User(1, "bilal", "cakir", "bilal@yaani.com", "123456");
		User kural = new User(2, "a", "adasdas", "bila@yaaa.com", "1234567");
		User kural1 = new User(2, "aas", "adasdas", "bilal@yaani.com", "1234567");
		
		UserDao userDao = new HibernateUserDao();
		
		EmailSendService emailSendService=new EmailSendManagerAdapter();
		EmailCheckService emailCheckService=new EmailCheckManager();
		LoginService googleService = new GoogleManagerAdapter();
		
		UserService userService = new UserManager(emailCheckService, googleService, userDao, emailSendService);
		userService.register(bilal);
		userService.register(kural);
		userService.register(kural1);

	}

}
