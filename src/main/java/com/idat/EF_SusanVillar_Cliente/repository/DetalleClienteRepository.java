package com.idat.EF_SusanVillar_Cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EF_SusanVillar_Cliente.entity.ClienteDetalle;

@Repository
public interface DetalleClienteRepository extends JpaRepository<ClienteDetalle, Integer> {
	

}
