package com.marblesit.cbexample.service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marblesit.cbexample.dao.UserEntity;
import com.marblesit.cbexample.dao.UserRepository;
import com.marblesit.circuitbreaker.CircuitBreaker;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	@CircuitBreaker
	public Collection<User> getAllUsers() {
		return
			StreamSupport.stream(repo.findAll().spliterator(), false).
				map(userEntity -> map(userEntity)).collect(Collectors.toList());
	}

	private User map(UserEntity userEntity) {
		Set<String> emails =
				userEntity.getEmailAddresses().stream().
					map(ema -> ema.getEmail()).
					collect(Collectors.toSet());

		return new User(userEntity.getId(), userEntity.getName(), emails);
	}
}
