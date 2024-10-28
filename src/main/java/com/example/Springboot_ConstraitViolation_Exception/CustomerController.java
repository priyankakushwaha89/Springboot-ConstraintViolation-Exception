package com.example.Springboot_ConstraitViolation_Exception;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class CustomerController {
    @Autowired
    CustomerRepository crepo;

    @RequestMapping("/test")
    public String test()
    {
        return "Hello! this is Constraint Violation Exception application";
    }

    @PostMapping("/save")
    public String saveData(@Valid @RequestBody Customer customer)
    {
        crepo.save(customer);
        return "Data saved";
    }

    @GetMapping("/all")
    public List<Customer> allData()
    {
        return crepo.findAll();
    }



}
