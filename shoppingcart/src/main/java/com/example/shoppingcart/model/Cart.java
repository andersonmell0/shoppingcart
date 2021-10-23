package com.example.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("cart")
public class Cart {

	@Id
	private Integer id;
	private List<Item> items;
	
	public Cart() {		
	}
	
	public Cart(Integer id) {
		this.id=id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public List<Item> getItems(){
		if (items == null) {
			items = new ArrayList<>();
		}
		return items;
	}
}