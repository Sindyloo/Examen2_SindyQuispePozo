package com.idat.idatapirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.service.ClienteService;

@RestController
@RequestMapping("/cliente/v1")
public class ClienteController {
	@Autowired 
	private ClienteService service;

}
