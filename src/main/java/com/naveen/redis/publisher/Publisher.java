package com.naveen.redis.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.redis.dto.Product;

@RestController
@Component
public class Publisher {
	
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
    private ChannelTopic topic;
	
	@PostMapping("/publish")
	public String publish(@RequestBody Product product)
	{
		redisTemplate.convertAndSend(topic.getTopic(), product.toString());
		return "Event Published";
	}
  
}
