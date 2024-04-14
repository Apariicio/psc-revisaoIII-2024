package RevisaoTres;
/*Escreva um código Java que
 lê um número inteiro do usuário e imprime a sua tabuada */
 import java.util.Scanner;
public class QuestaoNove {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int nu = scanner.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(nu + " x " + i + " = " + nu*i);
        scanner.close();
        }
    }    
}