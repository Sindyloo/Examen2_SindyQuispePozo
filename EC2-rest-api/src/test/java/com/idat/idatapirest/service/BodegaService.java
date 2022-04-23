package com.idat.idatapirest.service;

import java.util.List;

import com.idat.idatapirest.dto.BodegaRequestDTO;
import com.idat.idatapirest.dto.BodegaResponseDTO;

public interface BodegaService {
	
	public void guardarBodega(BodegaRequestDTO c);
	public void eliminarBodega(Integer id);
	public void editarBodega(BodegaRequestDTO c);
	public List<BodegaResponseDTO> listarBodega();
	public BodegaResponseDTO bodegaById(Integer id);
}
