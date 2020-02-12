package br.com.ithappens.model;

import lombok.Data;

@Data
public class Produto {
    private long id;
    private Filial filial;
    private String descricao;
    private long quantidade;
}
