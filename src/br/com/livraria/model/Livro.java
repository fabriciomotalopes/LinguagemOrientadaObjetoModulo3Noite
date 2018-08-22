package br.com.livraria.model;

public class Livro {
    
    public Livro(){
        System.out.println("Criando um Livro");
    }

    public String nome;
    public String descricao;
    public double valor;
    public String isbn;

    public Autor autor;

    public void aplicaDescontoDe(double porcentagem) {
        this.valor = this.valor - (this.valor * porcentagem);
    }

    public boolean temAutor() {
        return this.autor != null;
    }

    public void mostrarDetalhes() {

        System.out.println("----- Mostrando Detalhes do Livro -----");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--------------------------------------------");

    }

}
