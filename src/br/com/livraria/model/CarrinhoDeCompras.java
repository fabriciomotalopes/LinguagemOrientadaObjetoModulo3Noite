package br.com.livraria.model;

public class CarrinhoDeCompras {
    
    private double total;
    
    public void adiciona(Livro livro){
        
        System.out.println("Adicionando: " + livro);        
        livro.aplicaDescontoDe(0.10);
        total += livro.getValor();
        
    }      

    public double getTotal() {
        return total;
    }  
    
}
