package com.validation.validation.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "addresses")
@Entity
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String street;

    private String state;

    @OneToOne(mappedBy = "address")
    private User user;
}
