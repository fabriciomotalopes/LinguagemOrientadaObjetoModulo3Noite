package br.com.livraria.test;

import br.com.livraria.model.Autor;
import br.com.livraria.model.Livro;

public class RegrasDeDesconto {

    public static void main(String[] args) {
        
        Autor autor = new Autor();

        autor.setNome("Fabricio Lopes");
        autor.setEmail("fabricio@fabricio.com.br");
        autor.setCpf("000.000.000-00");

        Livro livro = new Livro(autor);
        livro.setValor(59.90);

        System.out.println("Valor sem Desconto: " + livro.getValor());

        if (!livro.aplicaDescontoDe(0.2)) {
            System.out.println("O desconto e maior que 30%");
        } else {
            System.out.println("Valor com Desconto: " + livro.getValor());
        }

    }

}
