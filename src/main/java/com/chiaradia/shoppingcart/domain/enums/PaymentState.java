package com.chiaradia.shoppingcart.domain.enums;

public enum PaymentState {

    PENDING (1, "Pending"),
    COMPLETED (2, "Completed"),
    CANCELED (3, "Canceled");

    private int id;
    private String status;

    PaymentState(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public static PaymentState toEnum(Integer id) {
        if (id == null) {
            return null;
        }

        for (PaymentState c : PaymentState.values()) {
            if (id.equals(c.getId())) {
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid Payment State ID: " + id);

    }
}
