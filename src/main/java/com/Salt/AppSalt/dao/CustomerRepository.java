package com.Salt.AppSalt.dao;

import com.Salt.AppSalt.dto.CustomerDto;
import com.Salt.AppSalt.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("""
            SELECT new com.Salt.AppSalt.dto.CustomerDto(
            cus.id,
            cus.nama,
            cus.alamat,
            cus.kota,
            cus.provinsi,
            cus.registrasi,
            cus.status
            )
            FROM Customer as cus
            """)
    public List<CustomerDto> getList();
}
