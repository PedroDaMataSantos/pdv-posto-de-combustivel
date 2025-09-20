package com.br.pdvpostocombustivel.domain.service;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort; 




@Service
@Transactional

public class PessoaService {
    private final PessoaService pessoaService;


    public PessoaService(PessoaService pessoaService) {
        this.pessoaService = pessoaService;

        //create

        public PessoaResponse create(PessoaResponse pessoaResponse){
            validarUnicidadeCpfCnpj(req.cpfCnpj(), null);
            Pessoa nova =toEntity(req);
            return toResponse(pessoaService.save(nova));
        
    }

    @Transactional(readOnly = true)
    public PessoaResponse getById(Long id){
        Pessoa p = Repository.findById(id)
        .orElseThrow(()-> new RuntimeException("Pessoa não encontrada .id: "+id));
        return toResponse(p);

   
    }

    @Transactional(readOnly = true)
    public Page<PessoaResponse>list(int page, int size , String sortBy, String direction,Sort.Direction sortDirection){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, sortBy));
        return pessoaService.findAll(pageable).map(this::toResponse);

       
        
}
    }

    //
