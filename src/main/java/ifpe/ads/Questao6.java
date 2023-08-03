package ifpe.ads;

import java.util.Scanner;

// Questão 06: Leia o peso e a altura de 05 pessoas e calcule o IMC e armazene em um
// vetor. Após o termino do programa, imprima as seguintes informações:
//  O Número de pessoas que estão abaixo do peso (IMC < 18,5);
//  O Número de pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25);
//  O Número de pessoas que estão acima do peso (IMC > = 25)
public class Questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double peso;
        double altura;
        double imc;
        double imcs[] = new double[5];

        int pesoIdeal = 0;
        int acimaPeso = 0;
        int abaixoPeso = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Peso da %dº pessoa: ", i+1);
            peso = ler.nextDouble();

            System.out.printf("Altura da %dº pessoa: ", i+1);
            altura = ler.nextDouble();

            imc = peso / (altura * altura);
            imcs[i] = imc;
        }

        for (double v : imcs) {
            if (v < 18.5) {
                abaixoPeso++;
            } else if (v >= 25) {
                acimaPeso++;
            } else {
                pesoIdeal++;
            }

            System.out.printf("| %f |\n", v);
        }

        System.out.println("----------------------------");
        System.out.printf("%d pessoa(as) abaixo do peso. \n", abaixoPeso);
        System.out.printf("%d pessoa(as) acima do peso. \n", acimaPeso);
        System.out.printf("%d pessoa(as) no peso ideal. \n", pesoIdeal);
    }
}
