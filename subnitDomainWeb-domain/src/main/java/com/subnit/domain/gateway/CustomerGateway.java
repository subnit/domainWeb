package com.subnit.domain.gateway;

import com.subnit.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
