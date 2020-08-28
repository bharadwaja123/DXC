package com.myschool.mode;

public class college {
private int cid;
private String cname;
private String sid;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public college(int cid, String cname, String sid) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.sid = sid;
}
public college() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "college [cid=" + cid + ", cname=" + cname + ", sid=" + sid + "]";
}

}
