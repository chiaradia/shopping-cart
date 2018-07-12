package com.chiaradia.shoppingcart.domain;

import com.chiaradia.shoppingcart.domain.enums.PaymentState;

import javax.persistence.Entity;

@Entity
public class PaymentCreditCard extends Payment {

    private Integer numberInstallments;

    public PaymentCreditCard(PaymentState paymentState, PurchaseOrder order, Integer numberInstallments) {
        super(paymentState, order);
        this.numberInstallments = numberInstallments;
    }

    public Integer getNumberInstallments() {
        return numberInstallments;
    }

    public void setNumberInstallments(Integer numberInstallments) {
        this.numberInstallments = numberInstallments;
    }
}
