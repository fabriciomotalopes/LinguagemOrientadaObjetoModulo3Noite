package br.com.livraria.model;

public class Proprietario {

    public String nome;
    public String cnh;
    public String endereco;

    public void mostrarDetalhes() {

        System.out.println("----- Mostrando os detalhes do Proprietário -----");
        System.out.println("Nome: " + nome);
        System.out.println("CNH: " + cnh);
        System.out.println("Endereço: " + endereco);

    }
}
