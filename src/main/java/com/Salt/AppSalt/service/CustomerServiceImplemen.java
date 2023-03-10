package com.Salt.AppSalt.service;

import com.Salt.AppSalt.dao.CustomerRepository;
import com.Salt.AppSalt.dto.CustomerDto;
import com.Salt.AppSalt.dto.CustomerInsertDto;
import com.Salt.AppSalt.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CustomerServiceImplemen implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> getList() {
        return customerRepository.getList();
    }

    @Override
    public void insert(CustomerInsertDto dto) {

        LocalDate today = LocalDate.now();

        Customer customer = new Customer(dto.getId(), dto.getNama(),dto.getAlamat(), dto.getKota(),
                dto.getProvinsi(), today, dto.getActive() ? "Active" : "Non-Aktive");
        customerRepository.save(customer);
    }
}
