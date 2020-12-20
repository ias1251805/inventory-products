package com.product.inventory.wm.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.product.inventory.wm.model.Users;
import com.product.repository.inventory.UsersRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users users = usersRepository.findByEmail(email);

		if (users == null) {
			throw new UsernameNotFoundException("No such email: " + users);
		}

		return new User(users.getEmail(), users.getPassword(), new ArrayList<>());
		// return new User("admin","123",new ArrayList<>());
	}

}
