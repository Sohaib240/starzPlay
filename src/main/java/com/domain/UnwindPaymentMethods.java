package com.domain;

import java.util.List;

public class UnwindPaymentMethods {
    public String name;
    public String displayName;
    public String paymentType;
    public PaymentPlans paymentPlans;

    public UnwindPaymentMethods() {
    }

    public UnwindPaymentMethods(String name, String displayName, String paymentType, PaymentPlans paymentPlans) {
        this.name = name;
        this.displayName = displayName;
        this.paymentType = paymentType;
        this.paymentPlans = paymentPlans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentPlans getPaymentPlans() {
        return paymentPlans;
    }

    public void setPaymentPlans(PaymentPlans paymentPlans) {
        this.paymentPlans = paymentPlans;
    }
}
