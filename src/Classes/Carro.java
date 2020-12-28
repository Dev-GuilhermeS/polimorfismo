package Classes;

public class Carro extends Veiculo{
    private int QtRodas;

    @Override
    public void locomover() {
        System.out.println("Andando.\n");
    }

    @Override
    public void VelocidadeMaxima() {
        System.out.println("A Velocidade maxima é: 200 km/h.\n");
    }

    @Override
    public void eixos() {
        System.out.println("Possui 2 eixos.\n");
    }


    public int getQtRodas() {
        return QtRodas;
    }
    public void setQtRodas(int qtRodas) {
        QtRodas = qtRodas;
    }
}
