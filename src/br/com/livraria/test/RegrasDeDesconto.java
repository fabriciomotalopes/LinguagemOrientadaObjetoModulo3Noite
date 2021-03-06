package br.com.livraria.test;

import br.com.livraria.model.Autor;
import br.com.livraria.model.Ebook;
import br.com.livraria.model.Livro;
import br.com.livraria.model.LivroFisico;
import br.com.livraria.model.MiniLivro;

public class RegrasDeDesconto {

    public static void main(String[] args) {
        
        Autor autor = new Autor();

        autor.setNome("Fabricio Lopes");
        autor.setEmail("fabricio@fabricio.com.br");
        autor.setCpf("000.000.000-00");

        Livro livro = new LivroFisico(autor);
        livro.setValor(59.90);

        System.out.println("Valor sem Desconto: " + livro.getValor());

        if (!livro.aplicaDescontoDe(0.2)) {
            System.out.println("O desconto e maior que 30%");
        } else {
            System.out.println("Valor com Desconto: " + livro.getValor());
        }
        
        Ebook ebook = new Ebook(autor);
        ebook.setValor(59.90);
        
        System.out.println("Valor sem Desconto: " + ebook.getValor());

        if (!ebook.aplicaDescontoDe(0.2)) {
            System.out.println("O desconto e maior que 15%");
        } else {
            System.out.println("Valor com Desconto: " + ebook.getValor());
        }
        
        MiniLivro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(59.90);
        
        System.out.println("Valor sem Desconto: " + miniLivro.getValor());

        if (!miniLivro.aplicaDescontoDe(0.1)) {
            System.out.println("o mini livro não tem desconto");
        } else {
            System.out.println("Valor com Desconto: " + miniLivro.getValor());
        }

    }

}
