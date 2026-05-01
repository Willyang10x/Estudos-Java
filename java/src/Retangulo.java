public class Retangulo {
    public double comprimento;
    public double largura;

    public double calcularArea(){
        double resultado = this.comprimento * this.largura;
        return resultado;
    }

    public double calcularPerimetro(){
        double resultado = 2 *(this.comprimento + this. largura);
        return resultado;
    }
}
