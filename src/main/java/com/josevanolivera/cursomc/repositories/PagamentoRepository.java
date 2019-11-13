package com.josevanolivera.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josevanolivera.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Integer>{
	

}
