package com.Salt.AppSalt.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerInsertDto {

    private Long id;

    @NotBlank(message = "Nama tidak boleh kosong")
    @Size(max = 100, message = "Nama maksimal 100 karakter")
    private String nama;

    private String alamat;

    @Size(max = 20, message = "Kota maksimal 20 karakter")
    private String kota;

    @Size(max = 20, message = "Provinsi maksimal 20 karakter")
    private String provinsi;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate registrasi;

    private Boolean active;


}
