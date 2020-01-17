package com.cavetech.springboot.countbank.app.service;

import com.cavetech.springboot.countbank.app.domain.CountBank;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CountBankService {

	Mono<CountBank> save(CountBank countBank);



	Flux<CountBank> findAll();

	Mono<CountBank> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(CountBank countBank);

}
