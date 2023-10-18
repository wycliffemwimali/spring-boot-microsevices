package com.wycliffe.customer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .build();
        customerRepository.save(customer);
//        //todo: check if email valid
//        //todo: check if email not taken
//        customerRepository.saveAndFlush(customer);
//        //todo: check if fraudster
//        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
//                "http://FRAUD/api/v1/fraud-check/{customerId}",
//                FraudCheckResponse.class,
//                customer.getId()
//        );
//        assert fraudCheckResponse != null;
//        if (fraudCheckResponse.isFraudster()) {
//            throw new IllegalStateException("fraudster");
//        }
//        //todo: send notification
    }
}