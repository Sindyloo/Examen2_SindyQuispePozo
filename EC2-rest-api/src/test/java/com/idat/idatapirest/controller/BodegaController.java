package com.idat.idatapirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.service.BodegaService;

@RestController
@RequestMapping("/bodega/v1")
public class BodegaController {
	@Autowired
	private BodegaService service;

}
