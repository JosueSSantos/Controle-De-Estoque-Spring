package br.com.ithappens.service;

import br.com.ithappens.mapper.PedidoMapper;
import br.com.ithappens.model.PedidoEstoque;
import org.springframework.stereotype.Service;

@Service
public class PedidoService implements IPedidoService{
    private final PedidoMapper pedidoMapper;

    public PedidoService(PedidoMapper pedidoMapper){
        this.pedidoMapper = pedidoMapper;
    }
    public Boolean pedidoEstoque(PedidoEstoque pedidoEstoque) {
//        return pedidoMapper.pedidoEstoque(pedidoEstoque);
//        long idProduto;
//        idProduto = pedidoEstoque.getClass(pedidoMapper);

        return null;
    }
}
