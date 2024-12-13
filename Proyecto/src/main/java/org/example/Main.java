package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Manuel Carrera
 * @version 2.0
 */
public class Main {

    static Scanner in;

    /**
     * @author Manuel Carrera Martínez
     * @return texto - devuelve los años introducidos.
     */
    public static String introducirValor(){
        Scanner entrada=new Scanner(System.in);

        String texto=entrada.nextLine();

        return texto;
    }

    /**
     * @author Manuel Carrera Martínez
     * @param ano es el año que se cambiara el tipo de dato de String a int
     * @return anyos - devuelve el año ya cambiado para guardar en el Array
     */
    public static int cambiarValorANumero(String ano){
        int anyos;

        try {
            anyos = Integer.parseInt(ano);
        }catch (NumberFormatException err){
            anyos=-1;
        }

        return anyos;
    }

    /**
     * @author Manuel Carrera Martínez
     * @param numero es el valor del número que vamos a comprobar si tiene el formato correcto
     * @return situacion - devuelve si el año esta en el rango de 1 a 1900, si lo esta es true, si no, false
     */
    public static boolean comprobarCondicion(int numero){
        boolean situacion;
        if (numero > 1 && numero < 1900){
            situacion=true;
        }else {
            situacion=false;
        }
        return situacion;
    }

    /**
     *
     * @param anos es el array que contiene los años sin ordenar
     * @return - devuelve un booleano falso en el caso de que la edad de muerte es mayor a 100
     */
    public  static boolean comprobarCien(int[] anos){

        for (int i = 0; i < anos.length; i++) {
            if (i%2==0){
                if (anos[i+1]-anos[i]>=100){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @author Manuel Carrera Martínez
     * @param anos es el vector que contiene los años
     */
    public static void resultadoFinal(int[] anos){
        int[] anos_ordenado =anos.clone();
        Arrays.sort(anos_ordenado);

        if (anos[1]>anos[2]){
            int mayor=anos_ordenado[2];
            int menor=anos_ordenado[1];

            if (mayor-menor<0){
                System.out.println(0);
            }else {
                System.out.println(mayor-menor+1);
            }
        }else {
            System.out.println(0);
        }
    }

    public static void casoDePrueba() {
        String anyos=introducirValor();
        String[] anyos_texto=anyos.split(" ");
        int[] anos=new int[anyos_texto.length];
        boolean comp=true;

        if (anos.length==4){
            for (int i = 0; i < anos.length; i++) {
                anos[i]=cambiarValorANumero(anyos_texto[i]);
                comp=comprobarCondicion(anos[i]);
            }
            if (comp){
                comp=comprobarCien(anos);
                if (comp){
                    resultadoFinal(anos);
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean comp;
        do {
            try{
                in = new Scanner(System.in);
                comp=false;
            }catch (InputMismatchException err){
                in.nextLine();
                comp=true;
            }
        }while(comp);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}