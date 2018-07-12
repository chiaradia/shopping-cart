package com.chiaradia.shoppingcart.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Product implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;

    @JsonBackReference //Used to avoid cyclic reference
    @ManyToMany
    @JoinTable(
        name = "PRODUCT_CATEGORY",
        joinColumns = @JoinColumn(name="product_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories = new ArrayList<>();

    private Set<PurchaseOrderItem> purchaseOrderItems = new HashSet<>();

    public Product()
    {
    }

    public Product(String name, Double price)
    {
        this.name = name;
        this.price = price;
    }


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public Double getPrice()
    {
        return price;
    }


    public void setPrice(Double price)
    {
        this.price = price;
    }


    public List<Category> getCategories()
    {
        return categories;
    }


    public void setCategories(List<Category> categories)
    {
        this.categories = categories;
    }

    public Set<PurchaseOrderItem> getPurchaseOrderItems() {
        return purchaseOrderItems;
    }

    public void setPurchaseOrderItems(Set<PurchaseOrderItem> purchaseOrderItems) {
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

        Product product = (Product) o;

        return id.equals(product.id);
    }


    @Override
    public int hashCode()
    {
        return id.hashCode();
    }

}
