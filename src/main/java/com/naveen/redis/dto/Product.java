package com.naveen.redis.dto;


import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product  implements Serializable{
	

	private int id;
	private String name;
	private int qty;
	private long price;
	

}
