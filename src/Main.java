import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Descubra o número secreto entre 1 e 100!");

        while (palpite != numeroSecreto) {
            System.out.println("Digite seu palpite");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Está quase lá, mas o número secreto é um pouco maior. Tente novamente!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Está perto, mas o número secreto é um pouco menor. Tente novamente!");

            } else {
                System.out.println("Parabens! Você acertou com " + tentativas + " tentativas");
            }
        }
        scanner.close();
    }
}