package com.br.pdvpostocombustivel.domain.repository;
import java.util.Optional;
import com.br.pdvpostocombustivel.domain.entity.Acesso;

public interface AcessoRepository {

    Optional<Acesso> findByUsuario(String usuario);

    Optional<Acesso> findBySenha(String senha);

    boolean existsByUsuario(String usuario);
    
    boolean existsBySenha(String senha);
}
