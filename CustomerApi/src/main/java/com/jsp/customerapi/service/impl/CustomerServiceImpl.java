package com.jsp.customerapi.service.impl;

import com.jsp.customerapi.dao.CustomerDao;
import com.jsp.customerapi.dto.CustomerRegisterDto;
import com.jsp.customerapi.dto.CustomerResponse;
import com.jsp.customerapi.exception.CustomerException;
import com.jsp.customerapi.model.Customer;
import com.jsp.customerapi.service.CustomerService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;

    private CustomerResponse convertToResponse(Customer customer) {

        CustomerResponse response = new CustomerResponse();

        response.setId(customer.getId());
        response.setName(customer.getName());
        response.setEmail(customer.getEmail());
        response.setCity(customer.getCity());
        response.setAge(customer.getAge());

        return response;
    }

    @Override
    public CustomerResponse saveCustomer(CustomerRegisterDto dto) {

        if (customerDao.existsByEmail(dto.getEmail())) {
            throw new CustomerException("Customer already registered!");
        }

        Customer customer = new Customer();

        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setCity(dto.getCity());
        customer.setAge(dto.getAge());
        customer.setActive(true);

        Customer savedCustomer = customerDao.save(customer);

        return convertToResponse(savedCustomer);
    }

    @Override
    public CustomerResponse findById(int id) {

        Customer customer = customerDao.findById(id)
                .orElseThrow(() ->
                        new CustomerException("Customer not found"));

        return convertToResponse(customer);
    }

    @Override
    public List<CustomerResponse> findAllCustomers() {

        return customerDao.findAll()
                .stream()
                .map(this::convertToResponse)
                .toList();
    }

    @Override
    public CustomerResponse updateCustomer(
            int id, CustomerRegisterDto dto) {

        Customer customer = customerDao.findById(id)
                .orElseThrow(() ->
                        new CustomerException("Customer not found"));

        if (!customer.getEmail().equals(dto.getEmail())
                && customerDao.existsByEmail(dto.getEmail())) {

            throw new CustomerException("Email already registered!");
        }

        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setCity(dto.getCity());
        customer.setAge(dto.getAge());

        Customer updatedCustomer = customerDao.save(customer);

        return convertToResponse(updatedCustomer);
    }

    // DELETE CUSTOMER BY ID
    @Override
    public String deleteCustomer(int id) {

        Customer customer = customerDao.findById(id)
                .orElseThrow(() ->
                        new CustomerException("Customer not found"));

        customerDao.delete(customer);

        return "Customer deleted successfully";
    }
}