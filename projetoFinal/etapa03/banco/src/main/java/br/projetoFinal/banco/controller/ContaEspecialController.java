package br.projetoFinal.banco.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ContaEspecial criarContaEspecial(@RequestBody ContaEspecial contaEspecial) {
		return dao.save(contaEspecial);
	}

	@DeleteMapping("/conta-especial/deletar/{numero}")
	public void deletarContaEspecial(@PathVariable int numero) {
		dao.deleteById(numero);
	}

    @PostMapping("/conta-espcial/alterar")
    public ResponseEntity<ContaEspecial> alterarContaEspecial(@RequestBody ContaEspecial contaEspecial){
        try {
            if(contaEspecial.getNumero() > 0){
                ContaEspecial novaContaEspecial = dao.save(contaEspecial);    
                return ResponseEntity.ok(novaContaEspecial);
            }
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
	/*
	@PostMapping("/conta-especial/depositar/{numero}/{valorDeposito}")
    public ResponseEntity<ContaEspecial> deposita(@PathVariable int numero, double valorDeposito){
        ContaEspecial contaEspecial = dao.findById(numero).orElse(null);

        if (contaEspecial != null) {
			contaEspecial.depositar(valorDeposito);
            return ResponseEntity.ok(contaEspecial);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	@PostMapping("/conta-especial/sacar/{numero}/{valorSaque}")
    public ResponseEntity<ContaEspecial> saca(@PathVariable int numero, double valorSaque){
        ContaEspecial contaEspecial = dao.findById(numero).orElse(null);

        if (contaEspecial != null) {
			contaEspecial.depositar(valorSaque);
            return ResponseEntity.ok(contaEspecial);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	*/
}
