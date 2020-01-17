package com.cavetech.springboot.countbank.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cavetech.springboot.countbank.app.domain.CountBank;
import com.cavetech.springboot.countbank.app.repository.CountBankRepository;
import com.cavetech.springboot.countbank.app.service.CountBankService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class CountBankServiceImpl implements CountBankService {

	@Autowired
	private CountBankRepository countbankRepo;
	
	
	@Override
	public Mono<CountBank> save(CountBank productBank) {
		
		return this.countbankRepo.save(productBank);
	}

	

	@Override
	public Flux<CountBank> findAll() {
		return this.countbankRepo.findAll();
		
	}

	@Override
	public Mono<CountBank> findById(String id) {
		return this.countbankRepo.findById(id);
	}

	@Override
	public Mono<Void> deletexId(String id) {
		return this.countbankRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(CountBank productBank) {
		return this.countbankRepo.delete(productBank);
	}

}
