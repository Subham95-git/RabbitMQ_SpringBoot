package com.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

	@RabbitListener(queues = "Mobile")
	public void  getName(Person p) {
		System.out.println("Name --------------> "+p.getName());
	}
}
