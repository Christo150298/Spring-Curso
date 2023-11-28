package com.example.app1.entities;

import jakarta.persistence.*;
import lombok.*;
//@Data
@Entity
@NoArgsConstructor
@ToString()
@EqualsAndHashCode(of = ("id"))
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private int id;
    @Getter @Setter private String name;

    public Client(String name) {
        this.name = name;
    }
}