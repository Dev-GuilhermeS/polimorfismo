package Classes;

public class Caminhao extends Veiculo{
    private int ano;

    @Override
    public void locomover() {
        System.out.println("Transportando.\n");
    }

    @Override
    public void VelocidadeMaxima() {
        System.out.println("A Velocidade maxima é: 190 km/h.\n");
    }

    @Override
    public void eixos() {
        System.out.println("Possui 2 eixos duplos.\n");
    }

    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
