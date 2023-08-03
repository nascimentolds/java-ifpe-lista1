package ifpe.ads;

// Questão 05: Escreva um programa que leia dois números e a operação aritmética desejada.
// Se o usuário digita ‘+’, retorne o resultado da soma entre os números;
// Se o usuário digita ‘-’, retorne o resultado da subtração entre os números;
// Se o usuário digita ‘*’, retorne o resultado da multiplicação entre os números;
// Se o usuário digita ‘/’, retorne o resultado da divisão entre os números;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        float operacao = 0;
        String operador;

        System.out.print("Digite um número: ");
        numero1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        numero2 = sc.nextInt();

        System.out.print("Escolha um operador (+, -, *, /): ");
        operador = sc.next();

        switch (operador) {
            case "+" -> operacao = (float) numero1 + numero2;
            case "-" -> operacao = (float) numero1 - numero2;
            case "*" -> operacao = (float) numero1 * numero2;
            case "/" -> operacao = (float) numero1 / numero2;
        }
        
        System.out.printf("%d %s %d = %f", numero1, operador, numero2, operacao);
    }
}
