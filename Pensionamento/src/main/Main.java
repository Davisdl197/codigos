package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o quantos números você quer ler: ");
        int nums = in.nextInt();
        double media;
        int soma = 0;

        int[] numeros1 = new int[nums];

        System.out.println();

        for(int i = 0; i < numeros1.length; i++){
            System.out.print("Digite os números: ");
            numeros1[i] = in.nextInt();

            soma += numeros1[i];
            
        }

        media = ((double) soma) / numeros1.length;

        System.out.printf("Média dos valores: %.3lf", media);
        System.out.println();
        System.out.println("Elementos abaixo dessa média: ");
        System.out.println();

        for(int i = 0; i < numeros1.length; i++){
            if(numeros1[i] < media){
                System.out.println(numeros1[i]);
            }
        }

        in.close();
    }
}
