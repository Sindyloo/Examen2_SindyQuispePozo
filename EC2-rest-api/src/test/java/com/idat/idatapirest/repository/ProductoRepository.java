package com.idat.idatapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Productos;
@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {

}
