package com.donglin.springcloud.service.impl;


import com.donglin.springcloud.dao.PaymentDao;
import com.donglin.springcloud.entities.Payment;
import com.donglin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired //spring提供
    //@Resource //jdk提供的
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
