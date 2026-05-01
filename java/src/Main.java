// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[]args){

// //         Scanner sc = new Scanner(System.in);

// //         double x;
// //         x = sc.nextDouble();
// //         System.out.println("Voce digitou: " + x);

// //         sc.close();
// //     }
// // }


// public class Main
// {
// 	public static void main(String[] args) {
// 		Conta c1 = new Conta();
// 		c1.numero = 123;
// 		c1.nome = "TESTE";
// 		c1.saldo = 200;
// 		System.out.println(c1.nome);
// 		System.out.println(c1.saldo);
// 		Conta c2 = new Conta();
// 		c2.numero = 456;
// 		c2.nome = "TESTE2";
// 		c2.saldo = 300;
// 		System.out.println(c2.nome);
// 		System.out.println(c2.saldo);
// 		c1.saca(100);
// 		System.out.println(c1.saldo);
// 	}
// }


public class Main {

	public static void main(String[]args){
		Retangulo r1 = new Retangulo();
		r1.comprimento = 2.5;
		r1.largura = 5.2;
		System.out.println("comprimento = " + r1.comprimento);
		System.out.println("largura = " + r1.largura);
		//chamar os metodos e exibir os resultado - o valor da aréa 
		// e o valor do perimetro
	}
}