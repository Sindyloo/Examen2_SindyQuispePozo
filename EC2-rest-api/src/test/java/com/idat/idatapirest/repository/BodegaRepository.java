package com.idat.idatapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Bodega;
@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer> {

}
