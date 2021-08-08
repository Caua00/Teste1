package iniciante;

import java.util.Scanner;

/*Escreva um algoritmo em Java para ler um valor inteiro (aceitarsomente valores entre 1 e 10)
 e escrever a tabuada de 1 a 10 do valor lido.*/

public class Atividade6 {
    public static void main(String[] args) {
        //Váriaveis
        int X = 0, vzs, Y;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.println("Digite um valor entre 1 e 10: ");
        Y = scan.nextInt();

        //Processamento e saída
        if(Y>0 && Y<=10){
            while(X<=10){
                vzs = Y * X;
                System.out.println(Y+" X "+X+" = "+vzs);
                X++;
            }
        } else{
            System.out.println("Erro - Tente novamente");
        }
    }
}
