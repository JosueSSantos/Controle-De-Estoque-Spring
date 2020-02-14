package br.com.ithappens.service;

import br.com.ithappens.mapper.PedidoMapper;
import br.com.ithappens.model.PedidoEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService implements IPedidoService{
    @Autowired
    private PedidoMapper mapper;

    public Boolean pedidoEstoque(PedidoEstoque pedidoEstoque) {
        if (mapper.existe(pedidoEstoque)) {
            return mapper.atualiza(pedidoEstoque);
        } else {
            return mapper.inserir(pedidoEstoque);
        }
    }
}
