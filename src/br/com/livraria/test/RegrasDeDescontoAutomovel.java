/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.test;

import br.com.livraria.model.Automovel;

/**
 *
 * @author fabri
 */
public class RegrasDeDescontoAutomovel {
    
    public static void main(String[] args) {

        Automovel automovel = new Automovel();
        automovel.setValor(59.90);

        System.out.println("Valor sem Desconto: " + automovel.getValor());

        if (!automovel.aplicaDescontoDe(0.2)) {
            System.out.println("O desconto e maior que 30%");
        } else {
            System.out.println("Valor com Desconto: " + automovel.getValor());
        }

    }
    
}
