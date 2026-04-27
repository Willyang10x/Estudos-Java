public class PerfilUsuario {
    public static void main(String[] args) {
        String nome = "Carlos";
        int idadeEmAnos = 28;
        
        int diasVividos = idadeEmAnos * 365;
        
        System.out.println("--- PERFIL ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idadeEmAnos + " anos");
        System.out.println(nome + " já viveu aproximadamente " + diasVividos + " dias.");
    }
}