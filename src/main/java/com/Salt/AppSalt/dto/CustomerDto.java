package com.Salt.AppSalt.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDto {

    private Long id;

    private String nama;

    private String alamat;

    private String kota;

    private String provinsi;

    private LocalDate registrasi;

    private String status;
}
