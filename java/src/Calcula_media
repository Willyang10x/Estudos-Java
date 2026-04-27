import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno é: " + media);

        if (media >= 7.0) {
            System.out.println("Status: Aprovado! Parabéns!");
        } else {
            System.out.println("Status: Reprovado. Estude mais um pouco.");
        }

        leitor.close();
    }
}