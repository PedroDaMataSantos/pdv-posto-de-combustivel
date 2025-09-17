package com.br.pdvpostocombustivel.api.pessoa.dto;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

    /*
     Para resposta
     */
    

public record PessoaResponse(
    long id,
    String nomeCompleto,
    String cpfCnpj,
    long numeroCtps,
    LocalDate dataNascimento
        ){}
