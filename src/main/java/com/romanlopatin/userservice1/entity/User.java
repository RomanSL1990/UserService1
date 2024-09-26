package com.romanlopatin.userservice1.entity;


import liquibase.pro.packaged.E;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name")
    private String name;

}
