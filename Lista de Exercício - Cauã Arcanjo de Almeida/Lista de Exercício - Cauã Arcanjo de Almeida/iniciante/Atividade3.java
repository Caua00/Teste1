package iniciante;

//Escreva um algoritmo em Java que calcule e imprima a tabuada do 7(0 a 10).

public class Atividade3 {
    public static void main(String[] args) {
        //Variáveis
        int X = 0, vzs;

        //Processamento e saída
        while(X<=10){
            vzs = 7 * X;
            System.out.println("7 X "+X+" = "+vzs);
            X++;
        }
    }
    
}
