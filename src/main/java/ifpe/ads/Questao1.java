package ifpe.ads;

// Questão 01: Escreva um programa que calcule a idade do usuário. Para isso, o
// programa deve ler o ano de nascimento, o ano atual e depois mostrar a idade.
// Obs.: O ano deve ser informado no formato AAAA (ex.: 1980).

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoNasc;
        int anoAtual;
        int idade;

        System.out.print("Que ano você nasceu? ");
        anoNasc = sc.nextInt();

        System.out.print("Qual o ano atual? ");
        anoAtual = sc.nextInt();

        idade = anoAtual - anoNasc;

        System.out.printf("Você tem %d anos.", idade);

    }
}
