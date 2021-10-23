package com.example.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer>{

}