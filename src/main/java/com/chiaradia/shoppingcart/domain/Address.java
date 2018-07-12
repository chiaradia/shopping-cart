package com.chiaradia.shoppingcart.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String zip;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;


    public Address()
    {
    }


    public Address(String street, String number, String complement, String neighborhood, String zip, Client client, City city)
    {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.zip = zip;
        this.client = client;
        this.city = city;
    }


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public String getStreet()
    {
        return street;
    }


    public void setStreet(String street)
    {
        this.street = street;
    }


    public String getNumber()
    {
        return number;
    }


    public void setNumber(String number)
    {
        this.number = number;
    }


    public String getComplement()
    {
        return complement;
    }


    public void setComplement(String complement)
    {
        this.complement = complement;
    }


    public String getNeighborhood()
    {
        return neighborhood;
    }


    public void setNeighborhood(String neighborhood)
    {
        this.neighborhood = neighborhood;
    }


    public String getZip()
    {
        return zip;
    }


    public void setZip(String zip)
    {
        this.zip = zip;
    }


    public Client getClient()
    {
        return client;
    }


    public void setClient(Client client)
    {
        this.client = client;
    }


    public City getCity()
    {
        return city;
    }


    public void setCity(City city)
    {
        this.city = city;
    }
}
