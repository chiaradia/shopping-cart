package com.chiaradia.shoppingcart.controller;

import com.chiaradia.shoppingcart.domain.Client;
import com.chiaradia.shoppingcart.domain.PurchaseOrder;
import com.chiaradia.shoppingcart.service.ClientService;
import com.chiaradia.shoppingcart.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/orders")
public class PurchaseOrderController
{

    private final PurchaseOrderService purchaseOrderService;


    @Autowired
    public PurchaseOrderController(final PurchaseOrderService purchaseOrderService)
    {

        this.purchaseOrderService = purchaseOrderService;
    }


    @GetMapping("/{id}")
    public PurchaseOrder findById(@PathVariable("id") Integer id)
    {
        return this.purchaseOrderService.findPurchaseOrder(id);
    }

}
