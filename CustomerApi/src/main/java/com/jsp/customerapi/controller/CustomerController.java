package com.jsp.customerapi.controller;

import com.jsp.customerapi.dto.CustomerRegisterDto;
import com.jsp.customerapi.dto.CustomerResponse;
import com.jsp.customerapi.service.CustomerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<CustomerResponse> registerCustomer(
            @Valid @RequestBody CustomerRegisterDto dto) {

        CustomerResponse response = customerService.saveCustomer(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerResponse> getCustomerById(
            @PathVariable int id) {

        return ResponseEntity.ok(customerService.findById(id));
    }

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerResponse>> getAllCustomers() {

        return ResponseEntity.ok(customerService.findAllCustomers());
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<CustomerResponse> updateCustomer(
            @PathVariable int id,
            @Valid @RequestBody CustomerRegisterDto dto) {

        return ResponseEntity.ok(
                customerService.updateCustomer(id, dto));
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<String> deleteCustomer(
            @PathVariable int id) {

        return ResponseEntity.ok(
                customerService.deleteCustomer(id));
    }
}