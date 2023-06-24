package br.com.api.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.modelo.produtoModelo;
import br.com.api.produtos.modelo.respostaModelo;
import br.com.api.produtos.servico.produtoServico;

@RestController
public class produtoControle {

    @Autowired
    private produtoServico ps;

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody produtoModelo pm){
        return ps.cadastrarAlterar(pm, "alterar");
        }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody produtoModelo pm){
        return ps.cadastrarAlterar(pm, "cadastrar");
        }

    @GetMapping("/listar")
    public Iterable<produtoModelo> listar(){
        return ps.listar();
    }

    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<respostaModelo> remover(@PathVariable long codigo){
        return ps.remover(codigo);
    }

    @GetMapping("/")
    public String rota(){
        return "App funcionando";
    }
    
}
