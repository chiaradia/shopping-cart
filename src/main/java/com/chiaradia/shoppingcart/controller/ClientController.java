package com.chiaradia.shoppingcart.controller;

import com.chiaradia.shoppingcart.domain.Client;
import com.chiaradia.shoppingcart.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(final ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable("id") Integer id){
        return this.clientService.findClient(id);
    }

}
