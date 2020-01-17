package com.cavetech.springboot.countbank.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.cavetech.springboot.countbank.app.domain.CountBank;


public interface CountBankRepository extends ReactiveMongoRepository<CountBank, String>{

}
