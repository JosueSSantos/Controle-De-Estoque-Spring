package br.com.ithappens.controller;

import br.com.ithappens.model.Estoque;
import br.com.ithappens.model.Produto;
import br.com.ithappens.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemPedidoEstoque")
public class PedidoController {
    @Autowired
    private IProdutoService produtoService;
    public ResponseEntity pedidoProduto(@RequestBody Estoque estoque){
        return null;
    }
}
