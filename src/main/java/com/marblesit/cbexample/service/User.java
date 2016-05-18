package com.marblesit.cbexample.service;

import java.util.Set;

public class User {
	private Long id;
	private String name;
	private Set<String> emailAddresses;

	public User(Long id, String name, Set<String> emailAddresses) {
		super();
		this.id = id;
		this.name = name;
		this.emailAddresses = emailAddresses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(Set<String> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailAddresses=" + emailAddresses + "]";
	}
}
