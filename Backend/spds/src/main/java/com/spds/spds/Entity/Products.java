package com.spds.spds.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entry_id    ;
    private int category    ;
    private int scategory   ;
    private String name        ;
    private String plink       ;
    private String availability;
    private String status      ;
    private String description ;
    private String brand       ;
    private String tags        ;
    private String keywords    ;
    private double low_price   ;
    private String cities      ;
    private String benefits    ;
    private double cart_limit  ;
    private String stock       ;

}
