package com.chiaradia.shoppingcart.domain;

import com.chiaradia.shoppingcart.domain.enums.PaymentState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private Integer paymentState;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "purchase_order_id")
    @MapsId
    private PurchaseOrder purchaseOrder;


    public Payment()
    {

    }


    public Payment(PaymentState paymentState, PurchaseOrder purchaseOrder)
    {
        this.paymentState = paymentState.getId();
        this.purchaseOrder = purchaseOrder;
    }


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public PaymentState getPaymentState()
    {
        return PaymentState.toEnum(this.paymentState);
    }


    public void setPaymentState(PaymentState paymentState)
    {
        this.paymentState = paymentState.getId();
    }


    public PurchaseOrder getPurchaseOrder()
    {
        return purchaseOrder;
    }


    public void setPurchaseOrder(PurchaseOrder purchaseOrder)
    {
        this.purchaseOrder = purchaseOrder;
    }
}
