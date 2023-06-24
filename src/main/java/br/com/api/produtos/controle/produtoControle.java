package br.com.api.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.modelo.produtoModelo;
import br.com.api.produtos.servico.produtoServico;

@RestController
public class produtoControle {

    @Autowired
    private produtoServico ps;

    @GetMapping("/listar")
    public Iterable<produtoModelo> listar(){
        return ps.listar();
    }

    @GetMapping("/")
    public String rota(){
        return "App funcionando";
    }
    
}
