package com.wg.rhpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wg.rhpayroll.entities.Payment;
import com.wg.rhpayroll.entities.Worker;
import com.wg.rhpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {
		
	@Autowired
	private WorkerFeignClients workerFeignClients;
	
	public Payment getPayment(Long workerId, int days) {
		
		Worker worker = workerFeignClients.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}

}
