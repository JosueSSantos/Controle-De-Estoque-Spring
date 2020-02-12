package br.com.ithappens.service;

import br.com.ithappens.mapper.ProdutoMapper;
import br.com.ithappens.model.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService implements IProdutoService{
    private final ProdutoMapper produtoMapper;

    public ProdutoService(ProdutoMapper produtoMapper) {
        this.produtoMapper = produtoMapper;
    }

    @Override
    public Boolean salvarProduto(Produto produto) {
        return produtoMapper.salvarProduto(produto);
    };

}
