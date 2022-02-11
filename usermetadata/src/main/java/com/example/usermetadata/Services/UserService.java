package com.example.usermetadata.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;
import com.example.usermetadata.Repository.UsersRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public UserMetaData saveUserMetaDataTODB(UserMetaData metaData) {
		return userRepo.save(metaData);
		//return new UserMetaData();
	}

	public UserMetaData getsUserDetailsFromDB(String userId) {
		return userRepo.findAllByuniqueId(userId);
		//return new UserMetaData();
	}
}
