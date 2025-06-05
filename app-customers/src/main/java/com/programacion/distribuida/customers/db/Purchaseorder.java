package com.programacion.distribuida.customers.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "purchaseorder")
public class Purchaseorder {

    @Id
    @Column(length = 128)
    private Integer customer_id;


    private LocalDateTime deliveredor;
    private LocalDateTime placedon;
    private Integer status;
    private BigDecimal total;

}
