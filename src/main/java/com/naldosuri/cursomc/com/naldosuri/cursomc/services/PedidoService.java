package com.naldosuri.cursomc.com.naldosuri.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naldosuri.cursomc.com.naldosuri.cursomc.domain.Pedido;
import com.naldosuri.cursomc.com.naldosuri.cursomc.repositories.PedidoRepository;
import com.naldosuri.cursomc.com.naldosuri.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		
	}
}
