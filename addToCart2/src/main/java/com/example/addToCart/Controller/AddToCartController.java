package com.example.addToCart.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.CartDetails;
import com.example.addToCart.Services.AddToCartService;

@RestController
@RequestMapping("/amazon/addToCart")
public class AddToCartController {
	
	@Autowired
	AddToCartService addToCartService;
	
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart cart) {
		addToCartService.addItemTOCartService(cart);
	}
	
	@DeleteMapping("/remove")
	public void removeFromCart(@RequestBody Cart cart) {
		addToCartService.removeItemFromCartService(cart);
	}
	
	@GetMapping("/show/{userId}")
	public CartDetails showItems(@PathVariable UUID userId) {
		return addToCartService.displayAllProductsInCart(userId);
	}
}
