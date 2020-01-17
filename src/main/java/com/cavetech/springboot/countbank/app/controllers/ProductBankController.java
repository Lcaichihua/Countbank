package com.cavetech.springboot.countbank.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cavetech.springboot.countbank.app.domain.CountBank;
import com.cavetech.springboot.countbank.app.service.CountBankService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("countbank")
@RestController
public class ProductBankController {
	
	@Autowired
	private  CountBankService prodbankservice;

	@GetMapping("/list")
	public Flux<CountBank> findAll() {
		return prodbankservice.findAll();
	}

	@GetMapping("/{id}")
	public Mono<CountBank> finById(@PathVariable String id) {
		return prodbankservice.findById(id);
	}

	@PostMapping
	public Mono<CountBank> save(@RequestBody CountBank prodbank) {
		return prodbankservice.save(prodbank);
	}

	@PutMapping
	public Mono<CountBank> update(@RequestBody CountBank prodbank) {
		return prodbankservice.save(prodbank);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> eliminarProducto(@PathVariable String id){
		return prodbankservice.deletexId(id);
	}

}
