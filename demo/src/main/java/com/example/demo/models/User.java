package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private Long ID;
    private String F_name;
    private String s_name;
    private String L_name;
    private String role;
    private String status;
    private String Email;
    private String password;
}
