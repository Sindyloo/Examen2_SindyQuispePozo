package com.idat.idatapirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.dto.ProductoRequestDTO;
import com.idat.idatapirest.dto.ProductoResponseDTO;
import com.idat.idatapirest.model.Productos;
import com.idat.idatapirest.repository.ProductoRepository;
@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(ProductoRequestDTO p) {
		Productos producto = new Productos();
		producto.setIdProducto(p.getIdRequest());
		producto.setProducto(p.getProductoRequest());
		producto.setDescripcion(p.getDescripcionRequest());
		producto.setPrecio(p.getPrecioRequest());
		producto.setStock(p.getStockRequest());
		repository.save(producto);
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarProducto(ProductoRequestDTO p) {
		Productos producto = new Productos();
		producto.setIdProducto(p.getIdRequest());
		producto.setProducto(p.getProductoRequest());
		producto.setDescripcion(p.getDescripcionRequest());
		producto.setPrecio(p.getPrecioRequest());
		producto.setStock(p.getStockRequest());
		repository.saveAndFlush(producto);
		
	}

	@Override
	public List<ProductoResponseDTO> listarProducto() {
		List<Productos> producto = repository.findAll();
		List<ProductoResponseDTO> dto = new ArrayList<ProductoResponseDTO>();
		ProductoResponseDTO productoDTO = null;
		
		for (Productos products : producto) {
			productoDTO = new ProductoResponseDTO();
			productoDTO.setIdResponse(products.getIdProducto());
			productoDTO.setProductoResponse(products.getProducto());
			productoDTO.setDescripcionResponse(products.getDescripcion());
			productoDTO.setPrecioResponse(products.getPrecio());
			productoDTO.setStockResponse(products.getStock());
			dto.add(productoDTO);
		}
		return dto;
	}

	@Override
	public ProductoResponseDTO productById(Integer id) {
		Productos producto = repository.findById(id).orElse(null);
		ProductoResponseDTO productoDTO = new ProductoResponseDTO();
		productoDTO = new ProductoResponseDTO();
		productoDTO.setIdResponse(producto.getIdProducto());
		productoDTO.setProductoResponse(producto.getProducto());
		productoDTO.setDescripcionResponse(producto.getDescripcion());
		productoDTO.setPrecioResponse(producto.getPrecio());
		productoDTO.setStockResponse(producto.getStock());
		return productoDTO;
	}

}
