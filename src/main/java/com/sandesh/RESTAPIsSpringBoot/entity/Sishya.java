package com.sandesh.RESTAPIsSpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sishya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //start from 1,2,3,... in order
    private Long id;

    private String naam;

    private String nivasha;

    private String ePatram;
}

