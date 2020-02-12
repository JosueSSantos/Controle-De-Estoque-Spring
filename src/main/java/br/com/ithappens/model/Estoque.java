package br.com.ithappens.model;

import lombok.Data;

@Data
public class Estoque {
    private int id;
    private int filial;
    private int quantEstoque;
    private int idProduto;
}
