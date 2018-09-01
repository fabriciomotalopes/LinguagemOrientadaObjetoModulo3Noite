package br.com.automovel.test;

import br.com.automovel.model.Automovel;
import br.com.automovel.model.Proprietario;

public class RegrasDeDesconto {

    public static void main(String[] args) {

        Proprietario proprietario = new Proprietario();

        proprietario.setNome("Fabricio");
        proprietario.setCnh("123456789");
        proprietario.setEndereco("Rua do Topografo, 68");

        Automovel automovel = new Automovel(proprietario);
        automovel.setValor(59.90);

        System.out.println("Valor sem Desconto: " + automovel.getValor());

        if (!automovel.aplicaDescontoDe(0.2)) {
            System.out.println("O desconto e maior que 30%");
        } else {
            System.out.println("Valor com Desconto: " + automovel.getValor());
        }

    }

}
