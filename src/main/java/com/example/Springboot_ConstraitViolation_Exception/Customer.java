package com.example.Springboot_ConstraitViolation_Exception;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="ConstraintViolation")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ID",unique = true,nullable = false)
    int id;

    @Column(name="Name",nullable = false)
    @NotEmpty(message = "Name can not be empty")
    String name;

    @Column(name="Account number",nullable = false)
    @Pattern(regexp = "^[0-9]{9,16}$",message="Please Enter An Valid Account No")
    String accNo;

    @Column(name="Phone No")
    @Pattern(regexp="^[6-9]{1}[0-9]{9}$",message = "Please Enter An Valid Phone No")
    String phone;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
