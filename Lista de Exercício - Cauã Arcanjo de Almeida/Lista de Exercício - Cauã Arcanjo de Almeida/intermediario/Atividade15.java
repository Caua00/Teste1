package intermediario;

import java.util.Scanner;

/*Escreva uma classe em Java que, a partir das medidas dos lados de um retângulo, 
lidos via teclado, calcule a área e o perímetro deste retângulo.*/

public class Atividade15 {
    public static void main(String[] args) {
        //Variáveis
        double h, b, A, p;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.println("Qual a altura do seu retângulo? ");
        h = scan.nextDouble();
        System.out.println("Qual a base do seu retângulo?");
        b = scan.nextDouble();

        //Processamento
        A = b * h;
        p = 2 * b + 2 * h;

        //Saída
        if(b == h){
            System.out.println("Isso é um quadrado!!");
            System.out.println("A área desse quadrado é: "+A);
            System.out.println("O perímetro desse quadrado é: "+p);
        }else{
            System.out.println("A área desse retângulo é: "+A);
            System.out.println("O perímetro desse retângulo é: "+p);
        }
    }
}
