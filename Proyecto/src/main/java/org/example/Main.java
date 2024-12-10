package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in;

    /**
     * @author: Manuel Carrera
     * @version: 1.0
     */
    public static void casoDePrueba() {
        Scanner entrada=new Scanner(System.in);

        String anyos=entrada.nextLine();
        String[] anyos_texto=anyos.split(" ");
        int[] anos=new int[anyos_texto.length];
        boolean comp=true;

        if (anos.length==4){
            for (int i = 0; i < anos.length; i++) {
                    try {
                        anos[i]=Integer.parseInt(anyos_texto[i]);
                    }catch (NumberFormatException err){
                        comp=false;
                        break;
                    }
            }
            if (comp){
                int anos_ordenado[]=anos.clone();
                Arrays.sort(anos_ordenado);

                int mayor=anos_ordenado[anos_ordenado.length-1];
                int menor=anos_ordenado[0];

                if (anos[1]>=anos[2]){
                    int mayor_pos= Arrays.binarySearch(anos_ordenado, mayor);
                    int menor_pos= Arrays.binarySearch(anos_ordenado, menor);

                    mayor=anos_ordenado[mayor_pos-1];
                    menor=anos_ordenado[menor_pos+1];

                    if (mayor-menor<0){
                        System.out.println(0);
                    }else {
                        System.out.println(mayor-menor+1);
                    }

                }else {
                    System.out.println(0);
                }
            }
        }
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}