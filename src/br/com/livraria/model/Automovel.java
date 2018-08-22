package br.com.livraria.model;

public class Automovel {

    public String marca;
    public String modelo;
    public String cor;
    public int ano;
    public double valor;
    public Proprietario proprietario;

    public void mostrarDetalhes() {

        System.out.println("------- Mostrando os Detalhes do Automovel -------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);

        proprietario.mostrarDetalhes();

        System.out.println("---------------------------------------");

    }

}
