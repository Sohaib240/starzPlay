package com.controller;

import com.domain.PaymentMethods;
import com.domain.UnwindPaymentMethods;
import com.handler.PaymentsHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    private PaymentsHandler allPaymentsHandler;

    public PaymentController(PaymentsHandler allPaymentsHandler) {
        this.allPaymentsHandler = allPaymentsHandler;
    }

    @GetMapping(value = "/api/v1.0/configuration/payment-methods")
    public List<PaymentMethods> getAllPaymentMethods() {
        return allPaymentsHandler.findAll();
    }

    @GetMapping(value = "/api/v1.0/configuration/payment-methods", params = "name")
    public List<PaymentMethods> getByName(@RequestParam String name) {
        return allPaymentsHandler.findByname(name);
    }


    @GetMapping(value = "/api/v1.0/configuration/payment-methods", params = "id")
    public List<UnwindPaymentMethods> getByid(@RequestParam String id) {
        return allPaymentsHandler.findByid(id);

    }
}
