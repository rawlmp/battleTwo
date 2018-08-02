package com.battleship.Spring.VTwo.Battleship;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BattleshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(BattleshipApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PlayerRepo pRepo,
                                      GameRepo gRepo,
                                      GamePlayerRepo gpRepo){
		return args -> {

			//Adding PLayers
			Player p1 = new Player("Mike");
			Player p2 = new Player("Raul");
			Player p3 = new Player("Luis");

			//Adding Games
			Game g1 = new Game();
			Game g2 = new Game();
			Game g3 = new Game();

			//Adding GamePlayers
			GamePlayer gp1 = new GamePlayer(p1, g1);
			GamePlayer gp2 = new GamePlayer(p2, g1);
			GamePlayer gp3 = new GamePlayer(p1, g2);
			GamePlayer gp4 = new GamePlayer(p3, g2);
			GamePlayer gp5 = new GamePlayer(p2, g3);
			GamePlayer gp6 = new GamePlayer(p3, g3);

			//Save Players
			pRepo.save(p1);
			pRepo.save(p2);
			pRepo.save(p3);

			//Save Games
            gRepo.save(g1);
            gRepo.save(g2);
            gRepo.save(g3);

            //Save GamePlayers
            gpRepo.save(gp1);
            gpRepo.save(gp2);
            gpRepo.save(gp3);
            gpRepo.save(gp4);
            gpRepo.save(gp5);
            gpRepo.save(gp6);
		};
	}
}
