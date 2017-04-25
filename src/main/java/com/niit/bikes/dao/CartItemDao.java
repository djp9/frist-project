package com.niit.bikes.dao;

import com.niit.bikes.model.Cart;
import com.niit.bikes.model.CartItem;

/**
 * Created by Le on 1/25/2016.
 */
public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);

}
