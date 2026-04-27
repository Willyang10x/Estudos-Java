import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MENU DE TAREFAS ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Digite a nova tarefa: ");
                String tarefa = scanner.nextLine();
                tarefas.add(tarefa);
                System.out.println("Tarefa adicionada!");
            } else if (opcao == 2) {
                System.out.println("\n--- SUAS TAREFAS ---");
                if (tarefas.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + " - " + tarefas.get(i));
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Digite o número da tarefa para remover: ");
                int indice = scanner.nextInt();
                if (indice > 0 && indice <= tarefas.size()) {
                    tarefas.remove(indice - 1);
                    System.out.println("Tarefa removida com sucesso!");
                } else {
                    System.out.println("Número de tarefa inválido.");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}