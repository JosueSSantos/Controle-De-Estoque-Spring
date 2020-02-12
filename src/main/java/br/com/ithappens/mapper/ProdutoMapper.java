package br.com.ithappens.mapper;


import br.com.ithappens.model.Produto;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface ProdutoMapper {

     Boolean salvarProduto(@Param("produto") Produto produto);
}