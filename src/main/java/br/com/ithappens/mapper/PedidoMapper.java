package br.com.ithappens.mapper;

import br.com.ithappens.model.PedidoEstoque;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface PedidoMapper {
    Boolean existe (@Param("pedido") PedidoEstoque pedidoEstoque);
    Boolean atualiza (@Param("atualiza") PedidoEstoque pedidoEstoque);
    Boolean inserir (@Param("inserir") PedidoEstoque pedidoEstoque);
}
