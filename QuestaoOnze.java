package RevisaoTres;
/*Escreva um código Java que simula o jogo da adivinhação */
import java.util.Random;
import java.util.Scanner;
public class QuestaoOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numAle = random.nextInt(100) + 1;
        int tentativas = 0;
        System.out.println("Este é um jogo de adivinhação!\nTente adivinhar um número entre 1 e 100");        
        while (true) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;
            if (palpite == numAle) {
                System.out.println("Parabens! Voce acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (palpite > numAle) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Tente um número maior.");
            }
        }
        scanner.close();
    }
}