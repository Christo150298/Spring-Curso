package com.example.app1.configurations;

import com.example.app1.entities.Client;
import com.example.app1.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetUp {
    @Autowired
    private ClientRepository repo;
    @Bean
    public CommandLineRunner init () {
        return args -> {
            System.out.println("Inicializaciñon de base de datos");
            repo.save(new Client("Iñaki"));
            repo.save(new Client("Guille"));
            repo.save(new Client("Ferran"));

            System.out.println(repo.findAll());
        };
    }
}