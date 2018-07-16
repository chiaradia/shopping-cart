package com.chiaradia.shoppingcart.service;

import com.chiaradia.shoppingcart.domain.Client;
import com.chiaradia.shoppingcart.domain.PurchaseOrder;
import com.chiaradia.shoppingcart.exception.EntityNotFoundException;
import com.chiaradia.shoppingcart.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService
{
    private final PurchaseOrderRepository purchaseOrderRepository;


    @Autowired
    public PurchaseOrderService(final PurchaseOrderRepository purchaseOrderRepository)
    {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    public PurchaseOrder findPurchaseOrder(Integer id)
    {

        return findPurchaseOrderChecked(id);
    }


    private PurchaseOrder findPurchaseOrderChecked(Integer id)
    {
        return this.purchaseOrderRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Could not find entity with id: " + id));
    }
}
