package com.chiaradia.shoppingcart.domain;

import com.chiaradia.shoppingcart.domain.enums.PaymentState;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PaymentSlip extends Payment{

    private Date notAfter;

    private Date paymentDate;

    public PaymentSlip() {
    }

    public PaymentSlip(PaymentState paymentState, PurchaseOrder order, Date notAfter, Date paymentDate) {
        super(paymentState, order);
        this.notAfter = notAfter;
        this.paymentDate = paymentDate;
    }

    public Date getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(Date notAfter) {
        this.notAfter = notAfter;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
