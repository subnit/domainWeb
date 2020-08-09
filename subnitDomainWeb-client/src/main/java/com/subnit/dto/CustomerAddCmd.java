package com.subnit.dto;

import com.alibaba.cola.dto.Command;
import com.subnit.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private Customer customer;

}
