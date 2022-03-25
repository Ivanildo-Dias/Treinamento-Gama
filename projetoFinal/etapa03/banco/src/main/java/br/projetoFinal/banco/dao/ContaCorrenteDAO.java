package br.projetoFinal.banco.dao;

import org.springframework.data.repository.CrudRepository;

import br.projetoFinal.banco.model.ContaCorrente;

public interface ContaCorrenteDAO extends CrudRepository<ContaCorrente,Integer>{
}
