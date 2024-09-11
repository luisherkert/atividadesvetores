public class trocadevetores {
    public static void main(String[] args) {

        int[] valores = new int[2];
        valores[0] = 5;
        valores[1] = 10;
        System.out.println("Antes da Troca!");
        System.out.println("Posição 0: " + valores[0]);
        System.out.println("Posição 1:" + valores[1]);


        int tempo = valores[0];
        valores[0] = valores[1];
        valores[1] = tempo;


        System.out.println("Depois da Troca!");
        System.out.println("Posição 0: " + valores[0]);
        System.out.println("Posição 1:" + valores[1]);


    }
}
