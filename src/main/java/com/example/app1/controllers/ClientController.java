package com.example.app1.controllers;
import com.example.app1.entities.Client;
import com.example.app1.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "client")

public class ClientController {

    @Autowired
    private ClientRepository repoClient;
    @GetMapping(path="/")  // GET  .../client
    public List<Client> all() {
        return repoClient.findAll();
    }
    @GetMapping(path="/{id:\\d{1,5}}")
    public Client select(@PathVariable("id") int codigo) {
        return repoClient.findById(codigo).orElse(null);
    }

    @PostMapping(path = "") // POST .../client
    public void insert(Client client) {
        repoClient.save(client);
    }
}