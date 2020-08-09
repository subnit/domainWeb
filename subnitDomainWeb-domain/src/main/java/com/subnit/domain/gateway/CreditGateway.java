package com.subnit.domain.gateway;

import com.subnit.domain.customer.Customer;
import com.subnit.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
