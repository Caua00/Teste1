package intermediario;

import java.util.Scanner;

/*Escreva uma classe em Java para definir o IMC. Sabemos que a
condição física de uma pessoa pode ser medida com base no cálculo do IMC, Índice de
Massa Corporal, o qual é calculado dividindo-se a massa da pessoa (m em kg) pela altura da
mesma (h em m) elevada ao quadrado (IMC= m/h2). Sua classe deve ler a massa e a altura de
uma pessoa, calcular e mostrar o IMC.*/

public class Atividade16 {
    public static void main(String[] args) {
        //Variáveis
        double m, h, IMC;
        Scanner scan = new Scanner(System.in);
        
        //Entrada
        System.out.println("Qual seu peso? (em Kg) ");
        m = scan.nextDouble();
        System.out.println("Qual sua altura? (em metros)");
        h = scan.nextDouble();

        //Processamento
        IMC = m / (h * h);

        //Saída
        System.out.println("Seu IMC é "+IMC);
    }
}
