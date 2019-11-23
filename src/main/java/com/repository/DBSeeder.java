package com.repository;

import com.domain.PaymentMethods;
import com.domain.PaymentPlans;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    private PaymentRepository paymentRepository;

    public DBSeeder(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<PaymentMethods> paymentMethods = new ArrayList<>();
        paymentMethods.add(new PaymentMethods("credit card", "credit card", "CREDIT_CARD",
                Arrays.asList(
                        new PaymentPlans("1", 5.99, 13.5, 14.5, "currency", "september")
                )));

        paymentMethods.add(new PaymentMethods("alfa_lb", "Alfa Lebanon", "MOBILE_CARRIER",
                Arrays.asList(
                        new PaymentPlans("72", 5.99, 0, 5.99, "SAR", "Month"),
                        new PaymentPlans("54", 10, 0, 10, "USD", "Week")
                )
        ));
        this.paymentRepository.deleteAll();
        this.paymentRepository.saveAll(paymentMethods);
    }
}
