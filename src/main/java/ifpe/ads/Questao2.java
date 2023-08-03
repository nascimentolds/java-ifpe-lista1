package ifpe.ads;

import java.util.Scanner;

//Questão 02: Escreva um programa que leia a altura de 05 pessoas e calcule a média.
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float alturas;
        float total = 0;
        float media;

        for(int i = 0; i < 5; i++) {
            System.out.printf("Altura da pessoa %d ", i+1);
            alturas = sc.nextFloat();
            total = total + alturas;
        }

        media = total / 5;

        System.out.printf("A média das alturas é %f", media);

    }
}
