package Teste;

import Classes.Aviao;
import Classes.Caminhao;
import Classes.Carro;

public class TesteVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setPeso(2);
        carro.setTamanho(5);
        carro.setCor("Cinza");
        carro.setCategoria("Carro");
        carro.setQtRodas(4);
        carro.locomover();
        carro.VelocidadeMaxima();
        carro.eixos();

        Caminhao caminhao = new Caminhao();

        caminhao.setPeso(24);
        caminhao.setTamanho(16.4f);
        caminhao.setCor("Azul");
        caminhao.setCategoria("Caminhão");
        caminhao.setAno(2010);
        caminhao.locomover();
        caminhao.VelocidadeMaxima();
        caminhao.eixos();

        Aviao aviao = new Aviao();
        
        aviao.setPeso(575);
        aviao.setTamanho(84);
        aviao.setCor("Branco");
        aviao.setCategoria("Avião");
        aviao.setQtPassageros(300);
        aviao.locomover();
        aviao.VelocidadeMaxima();
        aviao.eixos();
        aviao.TipoVoo();

    }
    
}
