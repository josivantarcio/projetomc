package com.josevanolivera.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.josevanolivera.cursomc.domain.Categoria;
import com.josevanolivera.cursomc.domain.Cidade;
import com.josevanolivera.cursomc.domain.Cliente;
import com.josevanolivera.cursomc.domain.Endereco;
import com.josevanolivera.cursomc.domain.Estado;
import com.josevanolivera.cursomc.domain.Produto;
import com.josevanolivera.cursomc.domain.enums.TipoCliente;
import com.josevanolivera.cursomc.repositories.CategoriaRepository;
import com.josevanolivera.cursomc.repositories.CidadeRepository;
import com.josevanolivera.cursomc.repositories.ClienteRepository;
import com.josevanolivera.cursomc.repositories.EnderecoRepository;
import com.josevanolivera.cursomc.repositories.EstadoRepository;
import com.josevanolivera.cursomc.repositories.ProdutoRepository;


@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática - ADS");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2500.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "mouse", 60.00);
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "Ceará");
		
		Cidade cid1 = new Cidade(null, "Limoeiro do Norte", est2);
		Cidade cid2 = new Cidade(null, "Uberlandia", est1);
		Cidade cid3 = new Cidade(null, "Fortaleza", est2);
		
		Cliente cli1 = new Cliente(null, "Maria Antonia", "maria@gmail.com", "87666523411", TipoCliente.PESSOAFISICA);
		
		Endereco end1 = new Endereco(null, "Rua A", "12", "Casa", "Centro", "62932000", cli1, cid3);
		Endereco end2 = new Endereco(null, "Av. Dom Matos", "986", "Apto", "Santa Monica", "62930000", cli1, cid1);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		est1.getCidades().addAll(Arrays.asList(cid2));
		est2.getCidades().addAll(Arrays.asList(cid1, cid3));
		
		cli1.getTelefones().addAll(Arrays.asList("88998775253", "85988774562"));
		
		cli1.getEnderecos().addAll(Arrays.asList(end1));
		
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1, end2));
		
		
		
		
		
	}

}
