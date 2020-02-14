package br.com.ithappens.controller;

import br.com.ithappens.model.PedidoEstoque;
import br.com.ithappens.service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedido")

public class PedidoController {
    @Autowired
        private IPedidoService service;
            @PostMapping
            public ResponseEntity controller(@RequestBody PedidoEstoque pedidoEstoque){
              service.pedidoEstoque(pedidoEstoque);

              return ResponseEntity.ok(pedidoEstoque);
            };


}
