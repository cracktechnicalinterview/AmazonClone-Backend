package com.example.addToCart.Entity;

import java.math.BigInteger;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

public class Product {

@Getter @Setter
public BigInteger id;
	
	public UUID productID;
	public String name;
	public double price;
	public double rating;
	public String imageURL;
	
}
