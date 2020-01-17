package com.cavetech.springboot.countbank.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "TypecountBank")
public class TypecountBank {
	@Id
	private String id;
	private String description;

}
