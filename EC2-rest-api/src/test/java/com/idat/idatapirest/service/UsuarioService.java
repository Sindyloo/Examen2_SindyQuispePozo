package com.idat.idatapirest.service;

import java.util.List;

import com.idat.idatapirest.dto.UsuarioRequestDTO;
import com.idat.idatapirest.dto.UsuarioResponseDTO;

public interface UsuarioService {
	public void guardarUsuario(UsuarioRequestDTO p);
	public void eliminarUsuario(Integer id);
	public void editarUsuario(UsuarioRequestDTO p);
	public List<UsuarioResponseDTO> listarUsuario();
	public UsuarioResponseDTO usuarioById(Integer id);

}
