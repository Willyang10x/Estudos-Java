public class Conta {
    int numero;
    String nome;
    double saldo;
    
    void saca(double valor) {
        double novo_saldo = this.saldo - valor;
        this.saldo = novo_saldo;
    }
}