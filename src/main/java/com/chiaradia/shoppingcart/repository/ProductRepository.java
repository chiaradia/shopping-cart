package com.chiaradia.shoppingcart.repository;

import com.chiaradia.shoppingcart.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
}
