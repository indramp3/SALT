package com.Salt.AppSalt.service;

import com.Salt.AppSalt.dto.CustomerDto;
import com.Salt.AppSalt.dto.CustomerInsertDto;

import java.util.List;

public interface CustomerService {

    public List<CustomerDto> getList();

    public void insert(CustomerInsertDto dto);
}
