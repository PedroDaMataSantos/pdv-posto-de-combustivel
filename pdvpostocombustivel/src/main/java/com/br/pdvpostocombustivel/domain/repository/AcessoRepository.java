package com.br.pdvpostocombustivel.domain.repository;
import java.util.Optional;
import com.br.pdvpostocombustivel.domain.entity.Acesso;

public interface AcessoRepository {

    Optional<Acesso> findByName(String usuario);

    boolean existsByName(String usuario);
    
   
}
