package com.chiaradia.shoppingcart.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class PurchaseOrderItem implements Serializable
{

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @EmbeddedId
    private PurchaseOrderItemPK id = new PurchaseOrderItemPK();

    private Double discount;
    private Integer quantity;
    private Double price;


    public PurchaseOrderItem()
    {
    }


    public PurchaseOrderItem(PurchaseOrder purchaseOrder, Product product, Double discount, Integer quantity, Double price)
    {
        this.id.setPurchaseOrder(purchaseOrder);
        this.id.setProduct(product);
        this.discount = discount;
        this.quantity = quantity;
        this.price = price;
    }


    @JsonIgnore
    public PurchaseOrder getPurchaseOrder()
    {

        return this.id.getPurchaseOrder();
    }


    public Product getProduct()
    {

        return this.id.getProduct();
    }


    public PurchaseOrderItemPK getId()
    {
        return id;
    }


    public void setId(PurchaseOrderItemPK id)
    {
        this.id = id;
    }


    public Double getDiscount()
    {
        return discount;
    }


    public void setDiscount(Double discount)
    {
        this.discount = discount;
    }


    public Integer getQuantity()
    {
        return quantity;
    }


    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }


    public Double getPrice()
    {
        return price;
    }


    public void setPrice(Double price)
    {
        this.price = price;
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

        PurchaseOrderItem that = (PurchaseOrderItem) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }


    @Override
    public int hashCode()
    {
        return id != null ? id.hashCode() : 0;
    }
}
