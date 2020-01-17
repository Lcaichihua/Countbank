package com.cavetech.springboot.countbank.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.cavetech.springboot.countbank.app.domain.CountBank;

import com.cavetech.springboot.countbank.app.domain.TypecountBank;
import com.cavetech.springboot.countbank.app.repository.CountBankRepository;
import com.cavetech.springboot.countbank.app.repository.TypeCountBankRepository;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringbootCountBankApplication implements CommandLineRunner {

	@Autowired
	private CountBankRepository productbank;

	@Autowired
	private TypeCountBankRepository typeprodbank;

	@Autowired
	private ReactiveMongoTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCountBankApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
