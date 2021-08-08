package avancado;

import java.util.Scanner;

/*Escreva uma classe em Java que leia o valor do salário mínimo e o
valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha
e imprima o resultado. (1SM=R$1080,00).*/

public class Atividade34 {
    public static void main(String[] args) {
        //Variáveis
        double N, salario;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.println("Qual seu salário? ");
        salario = scan.nextDouble();

        //Processamento
        N = salario / 1080;

        //Saída
        if(N == 1){
            System.out.println("Você recebe 1 Salário mínimo");
        }else{
            System.out.println("Você recebe "+N+" Salários mínimos");
        }
    }
}
