package br.com.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.modelo.produtoModelo;
import br.com.api.produtos.modelo.respostaModelo;
import br.com.api.produtos.repositorio.produtoRepositorio;

@Service
public class produtoServico {
    
    @Autowired
    private produtoRepositorio pr;

    @Autowired
    private respostaModelo rm;

    //Retornar todos os produtos
    public Iterable<produtoModelo> listar(){
        return pr.findAll();
    }

    //Metódo para cadastrar ou alterar produtos
    public ResponseEntity<?> cadastrarAlterar(produtoModelo pm, String acao){

        if(pm.getNome().equals("")){
            rm.setMensagem("O nome do produto é obrigatório!");
            return new ResponseEntity<respostaModelo>(rm, HttpStatus.BAD_REQUEST);
        }else if(pm.getMarca().equals("")){
            rm.setMensagem("O nome da marca é obrigatório!");
            return new ResponseEntity<respostaModelo>(rm, HttpStatus.BAD_REQUEST);
        }else{
            if(acao.equals("cadastrar")){
            return new ResponseEntity<produtoModelo>(pr.save(pm), HttpStatus.CREATED);
            }else{
                return new ResponseEntity<produtoModelo>(pr.save(pm), HttpStatus.OK);
            }
        }
        
    }
}
