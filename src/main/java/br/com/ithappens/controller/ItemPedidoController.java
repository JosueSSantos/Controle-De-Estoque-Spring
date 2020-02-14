package br.com.ithappens.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;

import java.util.List;
@Data
@Controller
public class ItemPedidoController {
    private List<PedidoController> pedidoControllerList;
    public void add(PedidoController pedidoController){
        pedidoControllerList.add(pedidoController);
    }
}
