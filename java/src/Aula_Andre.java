import java.util.Scanner;

public class Aula_Andre {
    public static void main(String[]args){
        int soma = 0;
        int contador = 1;
        while (contador <= 10){
            soma = soma + contador;
            contador = contador + 1;
        }
        System.out.println("Soma = " + soma);

        int soma2 = 0;
        for (int contador2 = 1; contador2 <= 10; contador2 += 1){
            soma2 = soma2 + contador2;
        }
        System.out.println("Soma2 = " + soma2);

        int soma3 = 0;
        int contador3 = 0;

        do{
            soma3 = soma3 + contador3;
            contador3 = contador3 + 1;
        }while(contador3 <= 10);{
            System.out.println("Soma3 = " + soma3);
        }
        // do while para exibir menu
        int opcao;
        do{
            System.out.println("MENU");
            System.out.println("1 - TESTE1");
            System.out.println("2 - TESTE2");
            System.out.println("3 - TESTE3");
            System.out.println("0 - SAIR");
            Scanner s = new Scanner(System.in);
            opcao = s.nextInt();
        }while(opcao != 0);
        
    }
}
