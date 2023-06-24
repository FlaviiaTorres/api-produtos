package br.com.api.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos.modelo.produtoModelo;

@Repository
public interface produtoRepositorio extends CrudRepository<produtoModelo, Long> {
    
}
