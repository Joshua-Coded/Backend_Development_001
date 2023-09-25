package com.joshua.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Joshua {

	@Id
	private int jid;
	private String jname;
	private String color;
	
	
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
