package ifpe.ads;
// Questão 04: Escreva um programa que leia a idade de várias pessoas e calcule a média.
// O programa deve ler as idades até o usuário digitar 0 (zero).

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idades;
        int total = 0;
        int count = 0;
        float media;

        do {
            System.out.printf("Idade da pessoa %d ", count+1);
            idades = sc.nextInt();
            total = total + idades;

            if (idades != 0) {
                count++;
            }
        }
        while(idades != 0);

        media = (float) total /(count);

        System.out.printf("A média das idades é %f", media);

    }
}
