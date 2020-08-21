package com.mastertech.user.cep;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("cep")
public interface UserCep {

    @GetMapping("/{cep}")
    Cep getCep(@PathVariable String cep);
    
}