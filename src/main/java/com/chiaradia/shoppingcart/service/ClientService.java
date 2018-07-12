package com.chiaradia.shoppingcart.service;

import com.chiaradia.shoppingcart.domain.Client;
import com.chiaradia.shoppingcart.exception.EntityNotFoundException;
import com.chiaradia.shoppingcart.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;


    @Autowired
    public ClientService(final ClientRepository clientRepository)
    {
        this.clientRepository = clientRepository;
    }


    public Client findClient(Integer id)
    {
        return findClientChecked(id);
    }


    private Client findClientChecked(Integer id)
    {
        return this.clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Could not find entity with id: " + id));
    }

}
