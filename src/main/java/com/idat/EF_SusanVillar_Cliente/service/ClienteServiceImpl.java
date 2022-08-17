package com.idat.EF_SusanVillar_Cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EF_SusanVillar_Cliente.dto.Pizza;
import com.idat.EF_SusanVillar_Cliente.entity.Cliente;
import com.idat.EF_SusanVillar_Cliente.entity.ClienteDetalle;
import com.idat.EF_SusanVillar_Cliente.entity.PizzaClienteFK;
import com.idat.EF_SusanVillar_Cliente.repository.ClienteRepository;
import com.idat.EF_SusanVillar_Cliente.repository.DetalleClienteRepository;
import com.idat.EF_SusanVillar_Cliente.client.OpenFeignClient;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository repositoryCliente;
	
	@Autowired
	private DetalleClienteRepository repositoryDetalleCliente;
	
	@Autowired
	private OpenFeignClient feign ;
	
	@Override
	public void guardarCliente(Cliente cliente) {
		repositoryCliente.save(cliente);
	}
	
	@Override
	public void asignarClientePizza() {
		
		List<Pizza> listado = feign.listarPizzasSeleccionadas();
		PizzaClienteFK fk = null;
		ClienteDetalle detalle = null;
		
		for (Pizza pizza : listado) {
			
			fk = new PizzaClienteFK();
			fk.setIdPizza(pizza.getIdPizza());
			fk.setIdCliente(1);
			
			detalle = new ClienteDetalle();
			detalle.setFk(fk);	
			
			repositoryDetalleCliente.save(detalle);
		}

	}

}
