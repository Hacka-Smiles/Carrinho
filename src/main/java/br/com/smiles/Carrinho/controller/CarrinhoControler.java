package br.com.smiles.Carrinho.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Carrinho")
public class CarrinhoControler {

    @CrossOrigin(origins = "*")
    @GetMapping("/{idCarrinho")
    private ResponseEntity<?> consultaCarrinho(@PathVariable(value = "idCarrinho")String idCarrinho){




        return ResponseEntity.ok("Ok!");
    }
}
