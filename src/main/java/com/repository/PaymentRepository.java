package com.repository;

import com.domain.PaymentMethods;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends MongoRepository<PaymentMethods, String> {

    List<PaymentMethods> findByname(String name);

    @Query(value = "{'paymentPlans.id':?0}")
    List<PaymentMethods> findByid(String id);
}
