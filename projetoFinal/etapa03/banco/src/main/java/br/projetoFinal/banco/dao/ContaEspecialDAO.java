package br.projetoFinal.banco.dao;

import org.springframework.data.repository.CrudRepository;

import br.projetoFinal.banco.model.ContaEspecial;

public interface ContaEspecialDAO extends CrudRepository<ContaEspecial,Integer>{
}
