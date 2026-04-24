// import java.util.Scanner;

// public class Main {
//     public static void main(String[]args){

//         Scanner sc = new Scanner(System.in);

//         double x;
//         x = sc.nextDouble();
//         System.out.println("Voce digitou: " + x);

//         sc.close();
//     }
// }


public class Main
{
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.numero = 123;
		c1.nome = "TESTE";
		c1.saldo = 200;
		System.out.println(c1.nome);
		System.out.println(c1.saldo);
		Conta c2 = new Conta();
		c2.numero = 456;
		c2.nome = "TESTE2";
		c2.saldo = 300;
		System.out.println(c2.nome);
		System.out.println(c2.saldo);
		c1.saca(100);
		System.out.println(c1.saldo);
	}
}