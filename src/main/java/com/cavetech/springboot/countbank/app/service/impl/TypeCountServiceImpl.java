package com.cavetech.springboot.countbank.app.service.impl;

import org.springframework.stereotype.Service;

import com.cavetech.springboot.countbank.app.domain.TypecountBank;
import com.cavetech.springboot.countbank.app.repository.TypeCountBankRepository;
import com.cavetech.springboot.countbank.app.service.TypeCountbankService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class TypeCountServiceImpl implements TypeCountbankService{

	TypeCountBankRepository typeProductRepo;
	
	@Override
	public Mono<TypecountBank> save(TypecountBank typeProductBank) {
		return this.typeProductRepo.save(typeProductBank);
	}

	@Override
	public Flux<TypecountBank> findAll() {
		return this.typeProductRepo.findAll();
	}

	@Override
	public Mono<TypecountBank> findById(String id) {
		return this.typeProductRepo.findById(id);
	}

	@Override
	public Mono<Void> deletexId(String id) {
		return this.typeProductRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(TypecountBank typeProductBank) {
		return this.typeProductRepo.delete(typeProductBank);
	}

}
