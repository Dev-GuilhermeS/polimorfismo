package Teste;
import Classes.Carro;
import Classes.A3;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro2 = new Carro();
        carro2.setPeso(1.8f);
        carro2.setTamanho(3.5f);
        carro2.setCor("Preto");
        carro2.setCategoria("Carro");
        carro2.setQtRodas(4);
        carro2.locomover();
        carro2.VelocidadeMaxima();
        carro2.eixos();

        A3 a3 = new A3();
        a3.setPeso(1.5f);
        a3.setTamanho(3.7f);
        a3.setCor("Cinza Puro");
        a3.setCategoria("Carro");
        a3.setQtRodas(4);
        a3.locomover();
        a3.VelocidadeMaxima();
        a3.eixos();
        a3.status();
        
    }
    
}
