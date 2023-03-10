package com.Salt.AppSalt.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Konsumen")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "kota")
    private String kota;

    @Column(name = "provinsi")
    private String provinsi;

    @Column(name = "tgl_registrasi")
    private LocalDate registrasi;

    @Column(name = "status")
    private String status;
}
