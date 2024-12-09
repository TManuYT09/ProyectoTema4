package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class solution {
    static java.util.Scanner in;
    public static void casoDePrueba() {
        Scanner entrada=new Scanner(System.in);

        String anyos=entrada.nextLine();
        String[] anyos_texto=anyos.split(" ");
        int[] anos=new int[anyos_texto.length];

        for (int i = 0; i < anos.length; i++) {
            anos[i]=Integer.parseInt(anyos_texto[i]);
        }

        int anos_ordenado[]=anos.clone();
        Arrays.sort(anos_ordenado);

        int mayor=anos_ordenado[anos_ordenado.length-1];
        int menor=anos_ordenado[0];

        if (anos[1]>=anos[2]){
            int mayor_pos= Arrays.binarySearch(anos_ordenado, mayor);
            int menor_pos= Arrays.binarySearch(anos_ordenado, menor);

            for (int i = 0; i < anos.length; i++) {
                if ()
                    menor=anos[i];
            }

            for (int i = 0; i < anos.length; i++) {
                if ()
                    mayor=anos[i];
            }

            System.out.println(mayor-menor);
        }else {
            System.out.println(0);
        }


    }
    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}