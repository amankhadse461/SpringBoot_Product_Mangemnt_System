package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Supplier {

	@Id
	private int sid;
	private String sname;
	private String scontact;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScontact() {
		return scontact;
	}
	public void setScontact(String scontact) {
		this.scontact = scontact;
	}
	
}
