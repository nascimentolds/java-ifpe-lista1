package ifpe.ads;

//Questão 03: Escreva um programa que imprima os números pares entre 0 e 30.
public class Questao3 {
    public static void main(String[] args) {
        for(int i = 0; i < 31; i++) {
            if(i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}
