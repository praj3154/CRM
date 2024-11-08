package com.springboot.CRM.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("unused")
@Entity
@Table (name = "customers")
@Data
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
@Column ( name = "first_name")
 private String firstNmae;
@Column (name = "last_name")
 private String lastName;
@Column (name = "email")
 private String email;
@Column(name = "age")
 private int age ; 
@Column(name = "mobile_name")
private String mobileNumber;
 
 
 
 
}
