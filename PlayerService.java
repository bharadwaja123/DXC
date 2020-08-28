package com.myschool.service;

import com.myschool.dao.PlayerDao;
import com.myschool.mode.Player;

public class PlayerService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player=new Player("","mahi","dhoni","cric","ranchi","hcptr");
		PlayerDao dao=new PlayerDao();
		System.out.println(dao.PlayerCreate(player));
		
		
		dao.deletePlayer(player);
	
		player.setPlname("drive");
		player.setPfname("sachin");
		player.setPgame("cricket");
		player.setPnative("delhi");
		player.setPfav("straight");

		System.out.println(dao.UpdatePlayer(player,"madh003"));
		
		/*PlayerDao dao2=new PlayerDao();
         System.out.println(dao2.getPlayerByName("kohli"));*/
	
		dao.displayPlayer(player); 
	}

}
