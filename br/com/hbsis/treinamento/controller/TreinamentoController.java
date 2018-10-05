package br.com.hbsis.treinamento.treinamento.br.com.hbsis.treinamento.controller;

import br.com.hbsis.treinamento.treinamento.br.com.hbsis.treinamento.service.TreinamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/treinamento")
public class TreinamentoController {


    @Autowired
    TreinamentoService service;


    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public ResponseEntity<String> getNome(@PathVariable String nome) {
        return new ResponseEntity<String>("Meu nome é :" + nome, HttpStatus.OK);
    }


    @RequestMapping(value = "/{nome}/{idade}", method = RequestMethod.GET)
    public ResponseEntity<String> getIdade(@PathVariable String nome, @PathVariable Integer idade) {
        return new ResponseEntity<String>("Meu nome é : " + nome + ", minha idade + 10 é : " +  service.calcValor(10,idade), HttpStatus.OK);
    }

    @RequestMapping(value = "/pedido/{pedido}", method = RequestMethod.GET)
    public ResponseEntity<String> getPedido(@PathVariable String pedido) {
        return new ResponseEntity<String>("Meu pedido é : " + pedido, HttpStatus.OK);
    }


}
