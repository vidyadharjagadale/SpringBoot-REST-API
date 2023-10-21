package com.infotech.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.infotech.service.IActorMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner{
	
	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
