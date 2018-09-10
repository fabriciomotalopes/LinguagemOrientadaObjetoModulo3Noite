package br.com.livraria.test;

import br.com.livraria.model.Autor;
import br.com.livraria.model.CarrinhoDeCompras;
import br.com.livraria.model.Ebook;
import br.com.livraria.model.LivroFisico;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Fabricio da Mota Lopes");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        
        System.out.println("Total: " + carrinho.getTotal());

    }

}
