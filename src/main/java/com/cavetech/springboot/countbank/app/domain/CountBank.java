package com.cavetech.springboot.countbank.app.domain;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CountBank")
public  @Data  class CountBank {

	private String id;
	private String description;
	private TypecountBank typeProductBank;
	
	
	public CountBank(String description, TypecountBank typeProductBank) {
		super();
		this.description = description;
		this.typeProductBank = typeProductBank;
	}
	
	
}
