package com.jnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountNumber {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "acc_num")
	private int acc_num;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}

}
