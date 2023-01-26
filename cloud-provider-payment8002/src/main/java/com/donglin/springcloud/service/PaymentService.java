package com.donglin.springcloud.service;

import com.donglin.springcloud.entities.Payment;
import com.donglin.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment); //写
    public Payment getPaymentById(Long id);  //读取

}
