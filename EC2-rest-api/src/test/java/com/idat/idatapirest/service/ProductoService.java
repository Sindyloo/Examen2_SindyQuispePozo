package com.idat.idatapirest.service;

import java.util.List;

import com.idat.idatapirest.dto.ProductoRequestDTO;
import com.idat.idatapirest.dto.ProductoResponseDTO;

public interface ProductoService {
	public void guardarProducto(ProductoRequestDTO p);
	public void eliminarProducto(Integer id);
	public void editarProducto(ProductoRequestDTO p);
	public List<ProductoResponseDTO> listarProducto();
	public ProductoResponseDTO productById(Integer id);

}
