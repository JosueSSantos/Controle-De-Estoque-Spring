package br.com.ithappens.controller;

import br.com.ithappens.model.Produto;
import br.com.ithappens.service.IProdutoService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private IProdutoService iProdutoService;
        @PostMapping
        public ResponseEntity salvarProduto(@RequestBody Produto produto) {
            iProdutoService.salvarProduto(produto);
            return ResponseEntity.ok(produto.getId());

    }

}
