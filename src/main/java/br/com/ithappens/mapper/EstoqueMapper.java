package br.com.ithappens.mapper;

import br.com.ithappens.model.Estoque;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EstoqueMapper {
  Boolean salvarEstoque(@Param("estoque") Estoque estoque);
}
