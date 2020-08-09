package com.subnit.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.subnit.api.CustomerServiceI;
import com.subnit.dto.CustomerAddCmd;
import com.subnit.dto.CustomerListByNameQry;
import com.subnit.dto.domainmodel.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subnit.executor.CustomerAddCmdExe;
import com.subnit.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;


@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}
