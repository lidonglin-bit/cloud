package com.donglin.springcloud.service;


public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(Integer id);
}
