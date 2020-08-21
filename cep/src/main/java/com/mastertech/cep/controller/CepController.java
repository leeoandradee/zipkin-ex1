package com.mastertech.cep.controller;

import com.mastertech.cep.model.Cep;
import com.mastertech.cep.service.CepService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public Cep getByCep(@PathVariable String cep) {
        return cepService.getCep(cep);
    }

    
}