package br.com.automovel.model;

public class Proprietario {

    private String nome;
    private String cnh;
    private String endereco;

    public void mostrarDetalhes() {

        System.out.println("----- Mostrando os detalhes do Proprietário -----");
        System.out.println("Nome: " + nome);
        System.out.println("CNH: " + cnh);
        System.out.println("Endereço: " + endereco);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
