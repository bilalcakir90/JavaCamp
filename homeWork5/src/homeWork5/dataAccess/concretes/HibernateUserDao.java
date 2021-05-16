package homeWork5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeWork5.dataAccess.abstracts.UserDao;
import homeWork5.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private List<String> users = new ArrayList<String>();

	@Override
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" "+" isimli kullanýcý Db'ye baþarýlý bir þekilde kaydedildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" "+" isimli kullanýcý bilgileri baþarýlý bir þekilde güncellendi.");

		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" "+" isimli kullanýcý Db'den baþarýlý bir þekilde silindi.");

		
	}

	@Override
	public void addEmail(User user) {
		users.add(user.getEmail());
		
	}

	@Override
	public List<String> getEmail() {
		
		return users;
	}
	
	

}