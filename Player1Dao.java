package com.myschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myschool.dbutil.DBconnection;
import com.myschool.mode.Player;
import com.myschool.mode.Player1;
import com.myschool.service.Product;

public class Player1Dao {
public String PlayerCreate(Player1 player1)
{
	try {
		Connection connection=DBconnection.getConnect();
		String sql="insert into Player values(?,?,?,?,?,?)";
		PreparedStatement stat=connection.prepareStatement(sql);
		stat.setString(1,player1.getPid());
		stat.setString(2,player1.getPfname());
		stat.setString(3,player1.getPlname());
		stat.setString(4,player1.getPgame());
		stat.setString(5,player1.getPnative());
		stat.setString(6,player1.getPfav());
		int res=stat.executeUpdate();
		if(res>0)
	  return "done bro!!!";
		else
			return "no one is";
	} catch (Exception e) {
		e.printStackTrace();
		return "exception"+e;
	}}
//===============================================================
	public String deletePlayer(Player player)
	{
		try {
			Connection connection=DBconnection.getConnect();
			String sql="delete from player where pid=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			stat.setString(1,player.getPid());
			int res=stat.executeUpdate();
			if(res>0)
				return "done delete";
			else
				return "not done";
		} catch (Exception e) {
			e.printStackTrace();
			return "exception"+e;
		}	
	}
	//=============================================
	public String displayPlayer(Player player)
	{
		try {
			Connection connection=DBconnection.getConnect();
			String sql="select * from player";
			PreparedStatement stat=connection.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			if(rs.next())
			{
				do
				{
					System.out.println(rs.getString("pId")+" "+rs.getString("pfName")+" "+rs.getString("plname")+" "+rs.getString("pgame")+" "+rs.getString("pnative")+" "+rs.getString("pfav"));
				}while(rs.next());
			}
			else
				return "no recs found";
		} catch (Exception e) {
			e.printStackTrace();
			return "exception"+e;
		}
	return "";
	}
	//==========================================================
	public String UpdatePlayer(Player player,String playerid)
	{
		try {
			Connection connection=DBconnection.getConnect();

Player existingPlayer= getPlayerById(playerid);
String sql="update player set pfname=? ,plname=?,pgame=?,pnative=?,pfav=? where pid=?";
PreparedStatement stat=connection.prepareStatement(sql);

if(player.getPfname()!=null)
{
existingPlayer.setPfname(player.getPfname());
}
if(player.getPlname()!=null)
{
existingPlayer.setPlname(player.getPlname());
}
if(player.getPgame()!=null)
{
existingPlayer.setPgame(player.getPgame());
}
if(player.getPnative()!=null)
{
existingPlayer.setPnative(player.getPnative());
}
if(player.getPfav()!=null)
{
existingPlayer.setPfav(player.getPfav());
}

stat.setString(1,existingPlayer.getPfname());
stat.setString(2, existingPlayer.getPlname());
stat.setString(3, existingPlayer.getPgame());
stat.setString(4, existingPlayer.getPnative());
stat.setString(5, existingPlayer.getPfav());
stat.setString(6,playerid);

int res= stat.executeUpdate();
if(res>0){
System.out.println(res);;
}
		} catch (Exception e) {
		  e.printStackTrace();
		}
	
	return "";
}
	private Player getPlayerById(String playerid) {
		return null;
	}
	//============================================================
	 public Player getPlayerByName(Player1 playerfname){
		 try
		 {
		 Connection connection=DBconnection.getConnect();
		 String sql="select * from Player where pfname=?";
		 PreparedStatement stat=connection.prepareStatement(sql);
		 stat.setString(2,playerfname);
		 ResultSet res= stat.executeQuery();
		 if(res.next())
		 {
		 String pid= res.getString(1);
		 String pfname= res.getString(2);
		 String plname= res.getString(3);
		 String pgame= res.getString(4);
		 String pnative= res.getString(5);
		 String pfav= res.getString(6);
		 Player player=new Player(pid, pfname, plname, pgame, pnative, pfav);
		 return player;
		 }
		 }
		 catch (Exception e) {
		 e.printStackTrace();

		 }

		 return null;
		 }}


