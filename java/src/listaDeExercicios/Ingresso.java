public class Ingresso {
    private String nomeEvento;
    private double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    public double exibirValor() {
        return this.valor;
    }

    public String imprimeEvento() {
        return "Evento: " + this.nomeEvento + " - Valor: R$ " + this.valor;
    }
}