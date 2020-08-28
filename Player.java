package com.myschool.mode;

public class Player {

	private String pid;
	private String pfname;
	private String plname;
	private String pgame;
	private String pnative;
	private String pfav;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPfname() {
		return pfname;
	}
	public void setPfname(String pfname) {
		this.pfname = pfname;
	}
	public String getPlname() {
		return plname;
	}
	public void setPlname(String plname) {
		this.plname = plname;
	}
	public String getPgame() {
		return pgame;
	}
	public void setPgame(String pgame) {
		this.pgame = pgame;
	}
	public String getPnative() {
		return pnative;
	}
	public void setPnative(String pnative) {
		this.pnative = pnative;
	}
	public String getPfav() {
		return pfav;
	}
	public void setPfav(String pfav) {
		this.pfav = pfav;
	}
	public Player(String pid, String pfname, String plname, String pgame, String pnative, String pfav) {
		super();
		this.pid = pid;
		this.pfname = pfname;
		this.plname = plname;
		this.pgame = pgame;
		this.pnative = pnative;
		this.pfav = pfav;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pfname=" + pfname + ", plname=" + plname + ", pgame=" + pgame + ", pnative="
				+ pnative + ", pfav=" + pfav + "]";
	}
	
}
