package com.springdatajpa.springboot.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products", schema = "spring_data_db", uniqueConstraints = {@UniqueConstraint(name = "sku_unique", columnNames = "sku")})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@ToString
public class Product {


    // POJO CLASS => plain old java object
    // POJO => java entity (db table)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ref")
    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imagUrl;
    @CreationTimestamp
    private LocalDateTime dataCreated;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;


}
