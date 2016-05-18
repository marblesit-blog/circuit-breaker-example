package com.marblesit.cbexample.dao;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {

	@Id
	@Column(name="id")
	private Long id;

	@Column(name="name")
	private String name;

	@OneToMany
	@JoinColumn(name="user_id")
	private Set<EmailAddressEntity> emailAddresses;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<EmailAddressEntity> getEmailAddresses() {
		return emailAddresses;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailAddresses=" + emailAddresses + "]";
	}
}
