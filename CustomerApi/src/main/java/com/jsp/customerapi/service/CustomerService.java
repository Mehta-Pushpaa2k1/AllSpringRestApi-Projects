package com.jsp.customerapi.service;

import com.jsp.customerapi.dto.CustomerRegisterDto;
import com.jsp.customerapi.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {
    CustomerResponse findById(int id);
    List<CustomerResponse> findAllCustomers();
    CustomerResponse updateCustomer(int id, CustomerRegisterDto dto);
    String deleteCustomer(int id);
    CustomerResponse saveCustomer(CustomerRegisterDto dto);
}