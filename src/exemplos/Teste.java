/* Faça um programa que peça um número inteiro, armazene-o em uma
variável e então mostre a mensagem
*
*/
import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");

    int numero = sc.nextInt();

    System.out.println("O número informado foi: " + Integer.toString(numero));
}