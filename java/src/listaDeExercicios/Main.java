public class Main {
    public static void main(String[] args) {
        Ingresso ingressoRock = new Ingresso("Festival de Rock", 150.50);

        System.out.println("--- Testando exibirValor() ---");
        double valor = ingressoRock.exibirValor();
        System.out.println("O valor isolado do ingresso é: R$ " + valor);
        
        System.out.println(); 

        System.out.println("--- Testando imprimeEvento() ---");
        String detalhesEvento = ingressoRock.imprimeEvento();
        System.out.println(detalhesEvento);
    }
}