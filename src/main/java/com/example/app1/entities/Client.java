package com.example.app1.entities;

import lombok.*;
//@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = ("id"))

public class Client {
    @Getter @Setter private int id;
    @Getter @Setter private String name;
}