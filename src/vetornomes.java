import java.util.Scanner;
public class vetornomes {
        public static void main(String[] args) {
            // Criação do objeto Scanner para ler entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Declaração do vetor de strings com 3 posições
            String[] nomes = new String[3];

            // Pedido e armazenamento dos nomes inseridos pelo usuário
            for (int i = 0; i < nomes.length; i++) {
                System.out.print("Digite o nome " +  ": ");
                nomes[i] = scanner.nextLine();
            }

            // Fechando o Scanner
            scanner.close();

            // Exibição dos nomes inseridos
            System.out.println("\nNomes inseridos:");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
            }
        }
    }

