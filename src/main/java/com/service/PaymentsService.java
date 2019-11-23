package com.service;

import com.domain.PaymentMethods;
import com.domain.UnwindPaymentMethods;
import com.mongodb.BasicDBObject;
import com.repository.PaymentRepository;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentsService {
    private final MongoTemplate mongoTemplate;
    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentsService(PaymentRepository paymentRepository, MongoTemplate mongoTemplate) {
        this.paymentRepository = paymentRepository;
        this.mongoTemplate = mongoTemplate;
    }

    public List<PaymentMethods> findAll() {
        return this.paymentRepository.findAll();
    }

    public List<PaymentMethods> findByname(String name) {
        return this.paymentRepository.findByname(name);
    }

    public List<UnwindPaymentMethods> findByid(String id) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.unwind("paymentPlans"),
                Aggregation.match(Criteria.where("paymentPlans._id").is(id)));
        return mongoTemplate.aggregate(aggregation, "PayMethods", UnwindPaymentMethods.class).getMappedResults();
    }
}
