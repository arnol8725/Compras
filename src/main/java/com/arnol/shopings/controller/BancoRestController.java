package com.arnol.shopings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arnol.shopings.entity.Banco;
import com.arnol.shopings.servicesImpl.bancoServicesImpl;






@CrossOrigin()
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value="/rest",method={RequestMethod.OPTIONS,RequestMethod.GET,RequestMethod.POST} )
public class BancoRestController {
			

	
	
	@Autowired
    @Qualifier("bancoServicesImpl")
	bancoServicesImpl bancoServicesImp;
	
	
	@CrossOrigin
	@GetMapping("/banco")	
	public ResponseEntity<List<Banco>> checkRest(){
		List<Banco> lista = bancoServicesImp.detBanco();
		return new ResponseEntity<List<Banco>>(lista,HttpStatus.OK);
	}
	
	
	
	
}