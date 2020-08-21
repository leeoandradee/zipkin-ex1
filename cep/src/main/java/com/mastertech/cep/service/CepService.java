package com.mastertech.cep.service;

import com.mastertech.cep.model.Cep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cep", url = "https://viacep.com.br/ws")
public interface CepService {

    @GetMapping("/{cep}/json")
    Cep getCep(@PathVariable String cep);
    
}