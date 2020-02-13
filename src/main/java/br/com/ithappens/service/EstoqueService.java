package br.com.ithappens.service;

import br.com.ithappens.mapper.EstoqueMapper;
import br.com.ithappens.model.Estoque;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService implements IEstoqueService{
    private final EstoqueMapper estoqueMapper;

    public EstoqueService(EstoqueMapper estoqueMapper) {
        this.estoqueMapper = estoqueMapper;
    }

    @Override
    public Boolean salvarEstoque(Estoque estoque) {
//        return estoqueMapper.salvarEstoque(estoque);
        return null;
    };

}