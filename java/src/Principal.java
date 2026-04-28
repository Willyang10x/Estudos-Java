// class ContaBancaria {
//     String titular;
//     double saldo;

//     void depositar(double valor) {
//         saldo = saldo + valor;
//     }

//     void sacar(double valor) {
//         saldo = saldo - valor;
//     }
// }

// public class Principal {
//     public static void main(String[] args) {
//         ContaBancaria conta = new ContaBancaria();
        
//         conta.titular = "João";
//         conta.saldo = 100.0;

//         conta.depositar(50.0);
        
//         conta.sacar(30.0);

//         System.out.println(conta.titular);
//         System.out.println(conta.saldo);
//     }
// }

class Carro {
    String modelo;
    int velocidade;

    void acelerar() {
        velocidade = velocidade + 10;
    }
}

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.modelo = "Fusca";
        meuCarro.velocidade = 0;

        meuCarro.acelerar();
        meuCarro.acelerar();

        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.velocidade);
    }
}