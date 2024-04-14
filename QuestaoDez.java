package RevisaoTres;
/*Escreva um código Java que calcula a soma dos números pares de 1 a 100. 
Imprima esses números
 */
public class QuestaoDez {
    public static void main(String[] args) {
        int soma = 0;
        for(int i=2; i<=100; i+=2){
            soma +=i;
            System.out.print(i + " ");
        }System.out.println("A soma dos numero pares de 1 a 100 é: " + soma);
    }    
}