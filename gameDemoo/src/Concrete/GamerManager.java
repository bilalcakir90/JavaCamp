package Concrete;

import Abstract.CheckUserService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private CheckUserService checkUserService;
	
	public  GamerManager(CheckUserService checkUserService) {
		this.checkUserService=checkUserService;
	}

	@Override
	public void add(Gamer gamer) {
		if(checkUserService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUsername()+ " kullanýcýsý eklendi.");
		}
		else {
			System.out.println("invalid person");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ "silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ "güncellendi.");
		
	}

}
