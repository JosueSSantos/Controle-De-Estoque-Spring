package br.com.ithappens.controller;

import br.com.ithappens.model.Estoque;
import br.com.ithappens.service.IEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estoque")
public class EstoqueController {
    @Autowired
    private IEstoqueService estoqueService;
        @PostMapping
        public ResponseEntity ItemPedidoEstoque(@RequestBody Estoque estoque){

             return null;
        }
}
