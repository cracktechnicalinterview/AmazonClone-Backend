package com.example.usermetadata.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.usermetadata.Entity.UserMetaData;

@Repository
public interface UsersRepo extends CrudRepository<UserMetaData, Long> {

}
