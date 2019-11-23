package com.domain;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PaymentPlans {

    private String id;
    private double netAmount;
    private double taxAmount;
    private double grossAmount;
    private String currency;
    private String month;

    protected PaymentPlans(){
    }

    @PersistenceConstructor
    public PaymentPlans(String id, double netAmount, double taxAmount, double grossAmount, String currency, String month) {
        this.id = id;
        this.netAmount = netAmount;
        this.taxAmount = taxAmount;
        this.grossAmount = grossAmount;
        this.currency = currency;
        this.month = month;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }

    public double getNetAmount() { return netAmount; }

    public void setNetAmount(double netAmount) { this.netAmount = netAmount; }

    public double getTaxAmount() { return taxAmount; }

    public void setTaxAmount(double taxAmount) { this.taxAmount = taxAmount; }

    public double getGrossAmount() { return grossAmount; }

    public void setGrossAmount(double grossAmount) { this.grossAmount = grossAmount; }

    public String getCurrency() { return currency; }

    public void setCurrency(String currency) { this.currency = currency; }

    public String getMonth() { return month; }

    public void setMonth(String month) { this.month = month; }
}
