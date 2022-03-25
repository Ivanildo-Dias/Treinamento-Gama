package br.projetoFinal.banco.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.projetoFinal.banco.dao.ContaEspecialDAO;
import br.projetoFinal.banco.model.ContaEspecial;

@CrossOrigin
@RestController

public class ContaEspecialController {
    @Autowired
	private ContaEspecialDAO dao;
	
	@GetMapping("/conta-especial/buscar")
	public ArrayList<ContaEspecial> recuperarTodasContasEspecial(){
		ArrayList<ContaEspecial> lista;
		lista = (ArrayList<ContaEspecial>)dao.findAll();
		return lista;
		}
	
	@GetMapping("/conta-especial/buscar/{numero}")
	public ContaEspecial recuperarContaEspecial(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}

	@PostMapping("/conta-especial/cadastrar")
	public ContaEspecial criarContaEspecial(ContaEspecial contaEspecial) {
		return dao.save(contaEspecial);
	}

	@DeleteMapping("/conta-especial/deletar/{numero}")
	public void deletarContaEspecial(@PathVariable int numero) {
		dao.deleteById(numero);
	}

}
