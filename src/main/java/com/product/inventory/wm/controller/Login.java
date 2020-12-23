package com.product.inventory.wm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.inventory.Util.JwtUtil;
import com.product.inventory.wm.model.AllUsersResponse;
import com.product.inventory.wm.model.AuthenticationRequest;
import com.product.inventory.wm.model.AuthenticationResponse;
import com.product.inventory.wm.model.Users;
import com.product.inventory.wm.serviceImpl.MyUserDetailsService;
import com.product.repository.inventory.UsersRepository;

@RestController
@RequestMapping(value = "account")
public class Login {
	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	UsersRepository usersRepository;

	@PostMapping(path = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createAutenticationRequest(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {
		try {

			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(),
					authenticationRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password");
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getEmail());

		Users users = usersRepository.findByEmail(authenticationRequest.getEmail());

		final String jwt = jwtUtil.generateToken(userDetails);

		users.setJwtToken(jwt);

		return ResponseEntity.ok().body(users);

	}

	@GetMapping(path = "/refresh-token", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getFreshToken(@RequestHeader(value = "email", required = false) String email ) throws Exception {
		try {
			
		
		final UserDetails userDetails = userDetailsService.loadUserByUsername(email);
		
		Users users = usersRepository.findByEmail(email);
		
		
		final String jwt = jwtUtil.generateToken(userDetails);
		
		users.setJwtToken(jwt);
		
		return ResponseEntity.ok().body(users);
		
		
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password");
		}

	}
	
	
	
	@GetMapping(path = "/get-accounts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUsers() throws Exception {
		try {
			
		
		
		
		List<Users> users = usersRepository.getAllUsers();
		
		
		return ResponseEntity.ok().body(users);
		
		
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password");
		}

	}
	
	@GetMapping(path = "/get-account-id", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUserById(@RequestParam("id") long  id) throws Exception {
		try {
			
		
		
		
		Users user = usersRepository.findById(id).get();
		
		
		return ResponseEntity.ok().body(user);
		
		
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password");
		}

	}

}
