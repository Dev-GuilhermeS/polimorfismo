package Classes;

public class A3 extends Carro{
    
    public void status(){
        System.out.println("Veiculo com revisões em dia.\n");
    }
    @Override
    public void locomover() {
        System.out.println("Em alta velocidade.\n");
    }
}
