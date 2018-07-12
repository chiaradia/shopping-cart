package com.chiaradia.shoppingcart.domain.enums;

public enum ClientType
{
    NATURAL_PERSON(1, "Natural person"),
    LEGAL_PERSON(2, "Legal person");

    private int code;
    private String desc;


    ClientType(int code, String desc)
    {
        this.code = code;
        this.desc = desc;
    }


    public int getCode()
    {
        return code;
    }


    public String getDesc()
    {
        return desc;
    }

    public static ClientType toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (ClientType c : ClientType.values()){
            if (code.equals(c.getCode())){
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid Client Type CODE: " + code);
    }
}
