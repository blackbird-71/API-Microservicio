package com.oerc.microservicio.controller;

import com.oerc.microservicio.entities.Customer;
import com.oerc.microservicio.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping()
    public List<Customer> list() {
        return customerRepository.findAll();
    }
/*
    @GetMapping("/{id}")
    public Customer get(@PathVariable String id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Customer input) {
        return null;
    }
*/
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Customer input) {
        Customer save=customerRepository.save(input);
        return ResponseEntity.ok(save);
    }
/*
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
*/
}
