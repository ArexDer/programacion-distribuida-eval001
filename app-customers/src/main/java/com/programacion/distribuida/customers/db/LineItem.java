package com.programacion.distribuida.customers.db;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "lineitem")
public class LineItem {


    @Id
    @OneToOne
    @JoinColumn(name ="order_id")
    private Purchaseorder purchaseorder;
    private Integer idx;

    private Integer order_id;

    private Integer quantity;
    @Column(length = 128)
    private String book_jabr;

}
