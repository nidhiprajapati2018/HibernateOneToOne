package com.jnit;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="employee1")
public class Employee1 {
	
	@Id
	@Column(name="eid")
	private int eid;
	
	@Column(name="fname")
	private String fName;
	
	@Column(name="lname")
	private String lname;
	
	@OneToOne
	private AccountNumber acc;

	public AccountNumber getAcc() {
		return acc;
	}

	public void setAcc(AccountNumber acc) {
		this.acc = acc;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
	
	
	
}
