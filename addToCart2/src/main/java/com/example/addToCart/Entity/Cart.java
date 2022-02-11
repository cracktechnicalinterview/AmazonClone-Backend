package com.example.addToCart.Entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;


@Entity(name="Cart")
public class Cart {

	@Id
	@GeneratedValue
	public long id;

    @Column(name = "userId", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    @Type(type = "uuid-char")
	public UUID userId;
    
    @Column(name = "productId", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
    @Type(type = "uuid-char")
	public UUID productId;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long id, UUID userId, UUID productId) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

}
