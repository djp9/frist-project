package com.niit.bikes.service;

import com.niit.bikes.model.CustomerOrder;

/**
 * Created by Le on 1/25/2016.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
