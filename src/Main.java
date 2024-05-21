import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;


        System.out.println("Bem vindo ao jogo de adivinhação");

        while (palpite != numeroSecreto) {
            System.out.println("Digite seu palpite e tente acertar o número secreto que vai de 1 até 100: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("Quase lá, mas o número secreto é menor do que seu palpite.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Quase lá, mas o número secreto é maior do que seu palpite.");
            } else {
                System.out.println("Parabéns! Você acertou o número "+ numeroSecreto + " em " + tentativas + " tentativas!");
            }

        }
    }
}