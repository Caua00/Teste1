package avancado;

import java.util.Scanner;

/*Escreva uma classe em Java que calcule a média das notas dos
alunos de uma sala de aula qualquer, sendo que em primeiro lugar deverá ser solicitada a
digitação da quantidade de alunos existentes nessa sala e, posteriormente, a digitação de
todas as notas dos alunos da mesma.*/

public class Atividade26 {
    public static void main(String[] args) {
        //Variáveis
        int a = 1, q;
        double nota, media, total = 0;
        Scanner scan = new Scanner(System.in);

        //Entrada e processamento
        System.out.println("Quantos alunos tem em sua sala? ");
        q = scan.nextInt();

        while(a <= q){
            System.out.println("Qual a nota do aluno "+a+"? ");
            nota = scan.nextInt();

            total = total + nota;
            a++;
        }
        media = total / q;

        //Saída
        System.out.println("A média da sala é: "+media);
    }
}
