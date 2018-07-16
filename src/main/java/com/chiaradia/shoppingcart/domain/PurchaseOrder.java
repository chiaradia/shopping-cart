package com.chiaradia.shoppingcart.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PurchaseOrder implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date instant;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "purchaseOrder")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "deliver_address_id")
    private Address deliverAddress;

    @OneToMany(mappedBy = "id.purchaseOrder")
    private Set<PurchaseOrderItem> purchaseOrderItems = new HashSet<>();


    public PurchaseOrder()
    {

    }


    public PurchaseOrder(Date instant, Payment payment, Client client, Address deliverAddress)
    {
        this.instant = instant;
        this.payment = payment;
        this.client = client;
        this.deliverAddress = deliverAddress;
    }


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public Date getInstant()
    {
        return instant;
    }


    public void setInstant(Date instant)
    {
        this.instant = instant;
    }


    public Payment getPayment()
    {
        return payment;
    }


    public void setPayment(Payment payment)
    {
        this.payment = payment;
    }


    public Client getClient()
    {
        return client;
    }


    public void setClient(Client client)
    {
        this.client = client;
    }


    public Address getDeliverAddress()
    {
        return deliverAddress;
    }


    public void setDeliverAddress(Address deliverAddress)
    {
        this.deliverAddress = deliverAddress;
    }


    public Set<PurchaseOrderItem> getPurchaseOrderItems()
    {
        return purchaseOrderItems;
    }


    public void setPurchaseOrderItems(Set<PurchaseOrderItem> purchaseOrderItems)
    {
        this.purchaseOrderItems = purchaseOrderItems;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        PurchaseOrder that = (PurchaseOrder) o;
        return Objects.equals(id, that.id);
    }


    @Override
    public int hashCode()
    {

        return Objects.hash(id);
    }
}
