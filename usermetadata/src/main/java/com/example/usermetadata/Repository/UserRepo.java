package com.example.usermetadata.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.usermetadata.Entity.UserMetaData;

@Repository
public interface UserRepo extends CrudRepository<UserMetaData, Long>{

	UserMetaData save(UserMetaData userdata);
	UserMetaData findAllByuniqueId(String uniqueId);
	
}
