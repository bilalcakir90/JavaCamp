package homeWork5.dataAccess.abstracts;

import java.util.List;

import homeWork5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	void addEmail (User user);
	List<String> getEmail();
	

}
