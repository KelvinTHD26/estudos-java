import java.util.Scanner;
public class test {
    static String[] nomes = new String[4];
    static String[] telefone = new String[4];
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        cadastrarContato();
        apresntarContatos();

        System.out.println("Busque um contato:");
        int posicao = buscarContato(entrada.nextLine());

        if (posicao != -1) {
            System.out.println("Contato encontrado: " + nomes[posicao]+ " - telefone: " + telefone[posicao]);
        }else  {
            System.out.println("Contato não encontrado");
        }

        System.out.println("Escolha um DDD: ");
        int quantidade = contarContatosComDDD(entrada.nextLine());
        System.out.println("Quantidade de contatos com esse DDD: " + quantidade);
    }

    public static void cadastrarContato() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite seu nome: ");
            nomes[i] = entrada.nextLine().trim();
            System.out.println("Digite seu telefone: ");
            telefone[i] = entrada.nextLine();
        }
    }
    public static void apresntarContatos() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i].toUpperCase() +" - "+ " telefone: " + telefone[i]);
        }
    }
    public static int buscarContato(String nomeProcurado) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].toUpperCase().equals(nomeProcurado.toUpperCase())) {
                return i;
            }
        }
        return -1;
    }
    public static int contarContatosComDDD(String ddd){
        int contatos = 0;
        for (int i = 0; i < telefone.length; i++) {
            if (telefone[i].startsWith(ddd)) {
                contatos++;
            }
        }
        return contatos;
    }
}
