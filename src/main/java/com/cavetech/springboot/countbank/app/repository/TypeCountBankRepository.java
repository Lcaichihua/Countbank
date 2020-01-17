package com.cavetech.springboot.countbank.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.cavetech.springboot.countbank.app.domain.TypecountBank;


public interface TypeCountBankRepository  extends ReactiveMongoRepository<TypecountBank, String>{

}
