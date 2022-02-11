package com.example.usermetadata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Services.UserService;

@RequestMapping("/amazon/users/")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("saveUserDetails")
	public UserMetaData saveUserDetail(@RequestBody UserMetaData userData) {
		UserMetaData user= userService.saveUserMetaDataTODB(userData);
		return user;
	}

	@GetMapping("getUserDetails/{userId}")
	public UserMetaData getUserDetails(@PathVariable String userId) {
		UserMetaData user=userService.getsUserDetailsFromDB(userId);
		return user;
	}
}
