import java.time.LocalDate;

import Adapters.CheckMernis;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(1, 214.99, "Fifa 2021");
		GameManager gameManager= new GameManager();
		gameManager.add(game);
		
		Gamer gamer = new Gamer(1, "BÝLAL", "ÇAKIR", "bilal@yaani.com", "ckrbll", "awdssa", LocalDate.of(1990, 11, 7),"33290135220");
		GamerManager gamerManager = new GamerManager(new CheckMernis());
		gamerManager.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Büyük Bahar Ýndirimi", 121.99);
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sale(game, gamer, campaign);
	}

}
