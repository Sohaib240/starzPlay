package com.domain;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Document(collection="PayMethods")
public class PaymentMethods {
    public String name;
    public String displayName;
    public String paymentType;
    public List<PaymentPlans> paymentPlans;


    protected PaymentMethods() {
    }

    public PaymentMethods(String name, String displayName, String paymentType, List<PaymentPlans> paymentPlans) {
        this.name = name;
        this.displayName = displayName;
        this.paymentType = paymentType;
        this.paymentPlans = paymentPlans;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDisplayName() { return displayName; }

    public void setDisplayName(String displayName) { this.displayName = displayName; }

    public String getPaymentType() { return paymentType; }

    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }

    public List<PaymentPlans> getPaymentPlans() { return paymentPlans; }

    public void setPaymentPlans(List<PaymentPlans> paymentPlans) { this.paymentPlans = paymentPlans; }
}
