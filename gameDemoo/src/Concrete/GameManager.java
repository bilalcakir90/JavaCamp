package Concrete;


import Abstract.GameService;
import Entities.Game;


public class GameManager implements GameService{
	
	
	

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " gŁncellendi.");
		
	}

}
