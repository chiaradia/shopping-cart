package com.chiaradia.shoppingcart.repository;

import com.chiaradia.shoppingcart.domain.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
}
