package com.marblesit.cbexample.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_addresses")
public class EmailAddress {

	@Id
	@Column(name="id")
	private Long id;

	@Column(name="email")
	private String email;

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return email;
	}
}
