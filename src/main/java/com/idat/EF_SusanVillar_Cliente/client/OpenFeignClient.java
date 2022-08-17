package com.idat.EF_SusanVillar_Cliente.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EF_SusanVillar_Cliente.dto.Pizza;

@FeignClient(name="EF-SusanVillarCliente", url="localhost:8082")
public interface OpenFeignClient {
	
	@GetMapping("/api/cliente/v1/listar")
	public List<Pizza> listarPizzasSeleccionadas();

}
