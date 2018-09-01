package br.com.automovel.model;

public class Automovel {
    
    public Automovel(Proprietario proprietario) {
        this.cor = "Branco";
        this.proprietario = proprietario;
    }

    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double valor;
    private Proprietario proprietario;

     public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor = this.valor - (this.valor * porcentagem);
        return true;
    }

    public boolean temProprietario() {
        return this.proprietario != null;
    }

    public void mostrarDetalhes() {

        System.out.println("------- Mostrando os Detalhes do Automovel -------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
        
        if (this.temProprietario()) {
            proprietario.mostrarDetalhes();
        }
        
        System.out.println("---------------------------------------");

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    

}
