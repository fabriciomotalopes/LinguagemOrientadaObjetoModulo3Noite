package br.com.automovel.test;

import br.com.automovel.model.Automovel;
import br.com.automovel.model.Proprietario;

public class CadastroDeAutomoveis {

    public static void main(String[] args) {

        Proprietario proprietario = new Proprietario();

        proprietario.setNome("Fabricio");
        proprietario.setCnh("123456789");
        proprietario.setEndereco("Rua do Topografo, 68");

        Automovel automovel = new Automovel(proprietario);

        automovel.setMarca("Fiat");
        automovel.setModelo("Uno");
        automovel.setCor("Preto");
        automovel.setAno(2001);
        automovel.setValor(10000);
        automovel.setProprietario(proprietario);
        
        automovel.aplicaDescontoDe(0.1);
        
        automovel.mostrarDetalhes();

        Proprietario outroProprietario = new Proprietario();

        outroProprietario.setNome("Fabio");
        outroProprietario.setCnh("123456987");
        outroProprietario.setEndereco("Rua Jose Marciano Pinto, 100");

        Automovel outroAutomovel = new Automovel(proprietario);

        outroAutomovel.setMarca("Toyota");
        outroAutomovel.setModelo("Hilux");
        outroAutomovel.setCor("Branca");
        outroAutomovel.setAno(2010);
        outroAutomovel.setValor(100000);
        outroAutomovel.setProprietario(outroProprietario);
        
        outroAutomovel.aplicaDescontoDe(0.2);

        outroAutomovel.mostrarDetalhes();

    }
}
