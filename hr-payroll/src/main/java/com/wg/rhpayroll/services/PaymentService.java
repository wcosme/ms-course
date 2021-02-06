package com.wg.rhpayroll.services;

import org.springframework.stereotype.Service;

import com.wg.rhpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Tom", 150.0, days);
		
	}

}
