package Classes;

public class Aviao extends Veiculo{
    private int qtPassageros;

    @Override
    public void locomover() {
        System.out.println("Voando.\n");
    }

    @Override
    public void VelocidadeMaxima() {
        System.out.println("A Velocidade maxima é: 900 km/h.\n");
    }

    @Override
    public void eixos() {
        System.out.println("Possui 3 eixos.\n");
    }

    public void TipoVoo() {
        System.out.println("Em um voo domestico.\n");
    }

    
    public int getQtPassageros() {
        return qtPassageros;
    }
    public void setQtPassageros(int qtPassageros) {
        this.qtPassageros = qtPassageros;
    }
}