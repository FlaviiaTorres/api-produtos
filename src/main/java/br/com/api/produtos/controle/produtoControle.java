package br.com.api.produtos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class produtoControle {

    @GetMapping
    public String rota(){
        return "App funcionando";
    }
    
}
