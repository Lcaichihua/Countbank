package com.cavetech.springboot.countbank.app.service;



import com.cavetech.springboot.countbank.app.domain.TypecountBank;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public interface TypeCountbankService  {

	Mono<TypecountBank> save(TypecountBank typecountBank);

	Flux<TypecountBank> findAll();

	Mono<TypecountBank> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(TypecountBank typecountBank);
	
}
