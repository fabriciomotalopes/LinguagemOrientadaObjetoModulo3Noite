package br.com.livraria.test;

import br.com.livraria.model.Automovel;
import br.com.livraria.model.Proprietario;

public class CadastroDeAutomoveis {

    public static void main(String[] args) {

        Proprietario proprietario = new Proprietario();

        proprietario.nome = "Fabricio";
        proprietario.cnh = "123456789";
        proprietario.endereco = "Rua do Topografo, 68";

        Automovel automovel = new Automovel();

        automovel.marca = "Fiat";
        automovel.modelo = "Uno";
        automovel.cor = "Preto";
        automovel.ano = 2001;
        automovel.valor = 10000;
        automovel.proprietario = proprietario;
        
        automovel.mostrarDetalhes();

        Proprietario outroProprietario = new Proprietario();

        outroProprietario.nome = "Fabio";
        outroProprietario.cnh = "123456987";
        outroProprietario.endereco = "Rua Jose Marciano Pinto, 100";

        Automovel outroAutomovel = new Automovel();

        outroAutomovel.marca = "Toyota";
        outroAutomovel.modelo = "Hilux";
        outroAutomovel.cor = "Branca";
        outroAutomovel.ano = 2010;
        outroAutomovel.valor = 100000;
        outroAutomovel.proprietario = outroProprietario;

        outroAutomovel.mostrarDetalhes();

    }
}
