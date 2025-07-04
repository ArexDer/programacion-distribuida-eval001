package com.programacion.distribuida.customers.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(length = 128)
    private Integer id;

    @Column(length = 128)
    private String email;

    @Column(length = 128)
    private String nombre;

    private Integer version;

}
