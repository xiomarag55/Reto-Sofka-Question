package com.example.retosoftka.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Jugador {
    @Id
    @GeneratedValue
    private Long id;
}
