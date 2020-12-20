package com.product.inventory.wm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.inventory.Util.JwtUtil;
import com.product.inventory.wm.model.AuthenticationRequest;
import com.product.inventory.wm.model.AuthenticationResponse;

@RestController
//@RequestMapping(value = "security")
public class Login {
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping(path = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createAutenticationRequest(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		try {
			
		
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(),authenticationRequest.getPassword())
				);
		}catch(BadCredentialsException e) {
			throw new Exception("Incorrect username or password");
		}
		
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getEmail());
		
		final String jwt = jwtUtil.generateToken(userDetails);
		
		
		return ResponseEntity.ok().body(new AuthenticationResponse(jwt));
		
		
	}

	

}
