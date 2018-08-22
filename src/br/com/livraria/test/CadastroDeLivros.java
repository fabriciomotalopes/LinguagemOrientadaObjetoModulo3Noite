package br.com.livraria.test;

import br.com.livraria.model.Autor;
import br.com.livraria.model.Livro;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();

        autor.nome = "Fabricio Lopes";
        autor.email = "fabricio@fabricio.com.br";
        autor.cpf = "000.000.000-00";

        Livro livro = new Livro();

        livro.nome = "Java 8 na Prática.";
        livro.descricao = "Novos recursos da linguagem.";
        livro.valor = 59.90;
        livro.isbn = "000-00-00000-00-0";
        livro.autor = autor;
        
        livro.aplicaDescontoDe(0.2);

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();

        outroAutor.nome = "Fernando Mota";
        outroAutor.email = "fernando@fernando.com.br";
        outroAutor.cpf = "111.111.111-11";

        Livro outroLivro = new Livro();

        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "111-11-11111-11-1";
        outroLivro.autor = outroAutor;
        
        outroLivro.aplicaDescontoDe(0.1);
        
        outroLivro.mostrarDetalhes();

    }
}
