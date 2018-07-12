package com.chiaradia.shoppingcart.domain;

import com.chiaradia.shoppingcart.domain.enums.PaymentState;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private Integer paymentState;

    @OneToOne
    @JoinColumn(name="purchase_order_id")
    @MapsId
    private PurchaseOrder purchaseOrder;

    public Payment(){

    }

    public Payment(PaymentState paymentState, PurchaseOrder purchaseOrder) {
        this.paymentState = paymentState.getId();
        this.purchaseOrder = purchaseOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PaymentState getPaymentState() {
        return PaymentState.toEnum(this.paymentState);
    }

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState.getId();
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
