package iniciante;

/*Escreva um algoritmo em Java para imprimir os números de 1 (inclusive) a 10 (inclusive) 
em ordem crescente. E depois imprima em ordem decrescente.*/

public class Atividade2 {
    public static void main(String[] args) {
        //Variáveis
        int X = 1;

        //Processamento e saída
        System.out.println("Ordem crescente:");
        while(X<=10){
            System.out.println(X);
            X++;
        }

        X--;

        System.out.println("Ordem decrescente:");
        while(X>0){
            System.out.println(X);
            X--;
        }
    }   
}
