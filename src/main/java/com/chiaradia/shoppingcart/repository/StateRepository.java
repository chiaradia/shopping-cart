package com.chiaradia.shoppingcart.repository;

import com.chiaradia.shoppingcart.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>
{
}
