package com.redhat.idaas.datasynthesis.dtos;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CreditCard {

    public String number;
    public String name;

    public CreditCard(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public CreditCard(String number) {
        this(number, null);
    }

    public CreditCard() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
