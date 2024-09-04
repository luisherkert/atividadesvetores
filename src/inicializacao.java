import java.util.Scanner;

public class inicializacao {
    public static void main(String[] args) {
        int[] votos = new int[5];

        votos[0] = 10;
        votos[1] = 20;
        votos[2] = 30;
        votos[3] = 40;
        votos[4] = 50;

        String[] nomes = new String[5];
        System.out.println("Informe o nome: ");
        Scanner entrada = new Scanner(System.in);
        nomes[0] = entrada.next();
        System.out.println( "" + votos[2]);
    }
}