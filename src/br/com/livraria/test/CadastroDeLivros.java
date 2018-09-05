package br.com.livraria.test;

import br.com.livraria.model.Autor;
import br.com.livraria.model.Livro;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();

        autor.setNome("Fabricio Lopes");
        autor.setEmail("fabricio@fabricio.com.br");
        autor.setCpf("000.000.000-00");

        Livro livro = new Livro(autor);

        livro.setNome("Java 8 na Prática.");
        livro.setDescricao("Novos recursos da linguagem.");
        livro.setValor(59.90);
        livro.setIsbn("000-00-00000-00-0");

        livro.aplicaDescontoDe(0.2);

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();

        outroAutor.setNome("Fernando Mota");
        outroAutor.setEmail("fernando@fernando.com.br");
        outroAutor.setCpf("111.111.111-11");

        Livro outroLivro = new Livro(outroAutor);

        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("111-11-11111-11-1");

        outroLivro.aplicaDescontoDe(0.1);

        outroLivro.mostrarDetalhes();

    }
}
