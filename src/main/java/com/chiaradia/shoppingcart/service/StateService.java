package com.chiaradia.shoppingcart.service;

import com.chiaradia.shoppingcart.domain.State;
import com.chiaradia.shoppingcart.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService
{
    private final StateRepository stateRepository;

    @Autowired
    public StateService(final StateRepository stateRepository){
        this.stateRepository = stateRepository;
    }

    public List<State> findAll(){
        return this.stateRepository.findAllByOrderByName();
    }
}
