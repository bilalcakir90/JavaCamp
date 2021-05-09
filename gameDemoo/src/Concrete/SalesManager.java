package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName()+" oyunu" + " "+ gamer.getUsername() +" kullan�c�s� taraf�ndan"+ " "+campaign.getDiscountPrice()+" tl kar��l��� al�nd�.");
		
	}

}
