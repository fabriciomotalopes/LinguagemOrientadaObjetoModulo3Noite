package br.com.livraria.model;

public class Livro {
    
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    
    public void mostrarDetalhes(){
        
        System.out.println("----- Mostrando Detalhes do Livro -----");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--------------------------------------------");
        
    }
    
}
