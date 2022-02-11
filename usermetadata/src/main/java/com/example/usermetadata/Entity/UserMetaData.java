package com.example.usermetadata.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "User")
public class UserMetaData {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String uniqueId;
	private String email;

	public UserMetaData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserMetaData(long id, String name, String uniqueId, String email) {
		super();
		this.id = id;
		this.name = name;
		this.uniqueId = uniqueId;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
