package com.handler;

import com.domain.PaymentMethods;
import com.domain.UnwindPaymentMethods;
import com.service.PaymentsService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentsHandler {
    private PaymentsService allPaymentsService;

    public PaymentsHandler(PaymentsService allPaymentsService) {
        this.allPaymentsService = allPaymentsService;
    }

    public List<PaymentMethods> findAll() {
        return this.allPaymentsService.findAll();
    }

    public List<PaymentMethods> findByname(String name) {
        return this.allPaymentsService.findByname(name);
    }

    public List<UnwindPaymentMethods> findByid(String id) {
        return this.allPaymentsService.findByid(id);
    }
}
