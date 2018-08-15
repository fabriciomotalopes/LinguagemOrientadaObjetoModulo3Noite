package br.com.livraria.test;

import br.com.livraria.model.Livro;

public class CadastroDeLivros {
    
    public static void main(String[] args) {        
        
        Livro livro = new Livro();
        
        livro.nome = "Java 8 na Prática.";
        livro.descricao = "Novos recursos da linguagem.";
        livro.valor = 59.90;
        livro.isbn = "000-00-00000-00-0";
        
        livro.mostrarDetalhes();
        
        Livro outroLivro = new Livro();
        
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "111-11-11111-11-1";
        
        outroLivro.mostrarDetalhes();
        
        
    }    
}
