package com.chiaradia.shoppingcart.domain;

public class PurchaseOrderItem {

    private PurchaseOrderItemPK id = new PurchaseOrderItemPK();

    private Double discount;
    private Integer quantity;
    private Double price;

    public PurchaseOrderItem() {
    }

    public PurchaseOrderItem(PurchaseOrder purchaseOrder, Product product, Double discount, Integer quantity, Double price) {
        this.id.setPurchaseOrder(purchaseOrder);
        this.id.setProduct(product);
        this.discount = discount;
        this.quantity = quantity;
        this.price = price;
    }

    public PurchaseOrder getPurchaseOrder(){
        return this.id.getPurchaseOrder();
    }

    public Product getProduct(){
        return this.id.getProduct();
    }

    public PurchaseOrderItemPK getId() {
        return id;
    }

    public void setId(PurchaseOrderItemPK id) {
        this.id = id;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
