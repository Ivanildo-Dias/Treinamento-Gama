package br.projetoFinal.banco.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.projetoFinal.banco.dao.ContaEspecialDAO;
import br.projetoFinal.banco.model.ContaEspecial;

@CrossOrigin
@RestController
public class ContaEspecialController {
    @Autowired
	private ContaEspecialDAO dao;
	@GetMapping("/conta-especial")
	public ArrayList<ContaEspecial> recuperarTodasContasEspecial(){
		ArrayList<ContaEspecial> lista;
		lista = (ArrayList<ContaEspecial>)dao.findAll();
		return lista;
		}
	
	@GetMapping("/conta-especial/{numero}")
	public ContaEspecial recuperarContaEspecial(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}
}
