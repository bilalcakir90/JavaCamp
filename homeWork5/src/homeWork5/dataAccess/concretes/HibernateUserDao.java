package homeWork5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeWork5.dataAccess.abstracts.UserDao;
import homeWork5.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private List<String> users = new ArrayList<String>();

	@Override
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" "+" isimli kullan�c� Db'ye ba�ar�l� bir �ekilde kaydedildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" "+" isimli kullan�c� bilgileri ba�ar�l� bir �ekilde g�ncellendi.");

		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+" "+" isimli kullan�c� Db'den ba�ar�l� bir �ekilde silindi.");

		
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