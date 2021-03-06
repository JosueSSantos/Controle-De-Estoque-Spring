package br.com.ithappens.mapper;

import br.com.ithappens.model.PedidoEstoque;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EstoqueMapper {

  Boolean salvarEstoque(@Param("estoque") PedidoEstoque pedidoEstoque);
}
