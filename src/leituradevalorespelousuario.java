import java.util.Scanner;
public class leituradevalorespelousuario {
    public static void main(String[] args) {
// Criação do objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor com 3 posições
        int[] vetor = new int[3];

        // Pedido e armazenamento dos números inseridos pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Fechando o Scanner
        scanner.close();

        // Exibição dos valores inseridos
        System.out.println("\nValores inseridos:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        // Cálculo da média dos valores
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        double media = soma / (double) vetor.length;

        // Exibição da média
        System.out.println("\nMédia dos valores: " + media);



    }
}
