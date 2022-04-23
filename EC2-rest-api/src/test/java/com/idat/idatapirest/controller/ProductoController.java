package com.idat.idatapirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.service.ProductoService;

@RestController
@RequestMapping("/producto/v1")
public class ProductoController {
	@Autowired
	private ProductoService service;

}
