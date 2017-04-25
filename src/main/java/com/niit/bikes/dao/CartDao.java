package com.niit.bikes.dao;

import java.io.IOException;

import com.niit.bikes.model.Cart;

/**
 * Created by Le on 1/11/2016.
 */
public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
