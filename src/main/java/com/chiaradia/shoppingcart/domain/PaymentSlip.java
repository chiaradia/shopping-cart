package com.chiaradia.shoppingcart.domain;

import com.chiaradia.shoppingcart.domain.enums.PaymentState;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class PaymentSlip extends Payment{

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date notAfter;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
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
