package com.oerc.microservicio.entities;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;
}
