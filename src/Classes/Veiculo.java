package Classes;

public abstract class Veiculo {
    protected float peso;
    protected float tamanho;
    protected String cor;
    protected String categoria;

    public abstract void locomover();
    public abstract void VelocidadeMaxima();
    public abstract void eixos();
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getTamanho() {
        return tamanho;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    
}
