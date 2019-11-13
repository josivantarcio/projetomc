package com.josevanolivera.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josevanolivera.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer>{
	

}
