package com.example.addToCart.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.addToCart.Entity.Cart;

@Repository
public interface AddToCartRepo extends CrudRepository<Cart, Long>{

	Cart save(Cart cart);
	void delete(Cart cart);
	ArrayList<Cart> findByuserId(UUID userId);
	
}
