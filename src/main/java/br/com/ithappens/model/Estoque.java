package br.com.ithappens.model;

import lombok.Data;

@Data
public class Estoque {
    private int id;
    private Filial filial;
    private long quantidade;
    private String descProduto;
}
