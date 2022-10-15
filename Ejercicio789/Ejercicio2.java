package Ejercicio789;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio2 {
    //Ejercicio1

    public static void main(String[] args)  {
        String[] nombres = {
                "pablo",
                "nicolas",
                "santiago"
        };

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("los nombres son: " + nombres[i] + " posicion " + i);
        }
        //Ejercicio2

        int[][] arrayBidimencional = new int[2][4];
        arrayBidimencional[0][0] = 1;
        arrayBidimencional[0][1] = 2;
        arrayBidimencional[0][2] = 3;
        arrayBidimencional[0][3] = 4;
        arrayBidimencional[1][0] = 10;
        arrayBidimencional[1][1] = 20;
        arrayBidimencional[1][2] = 30;
        arrayBidimencional[1][3] = 40;

        for (int i = 0; i < arrayBidimencional.length; i++) {
            System.out.println("valor de i:" + i);

            for (int j = 0; j < arrayBidimencional[i].length; j++) {
                System.out.println("estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidimencional[i][j]);
            }
        }
        //Ejercicio3

        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);

        System.out.println("contenido del vector: " + vector1);

        vector1.remove(2);
        vector1.remove(3);

        System.out.println("contenido del vector: " + vector1);
        System.out.println(" tamaño: " + vector1.size() + " capacidad: " + vector1.capacity());

        //Ejercicio4

        //el problema de utilizar un vector con la capacidad por defecto, es que al ir ingresando nuevos elementos
        //que superen su capacidad, esta se duplica, generando una copia y ocupando mayor espacio en memoria

        //Ejercicio5

        ArrayList<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");

        for (String elementos : lista) {
            System.out.println("lista 1: " + elementos);
        }

        LinkedList<String> lista2 = new LinkedList<>(lista);

        for (String elementos2 : lista2) {
            System.out.println("lista 2: " + elementos2);
        }

        //Ejercicio6

        ArrayList<Integer> enteros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            enteros.add(i);
            System.out.println(enteros);
        }
        for (int i :
                enteros) {
            System.out.println("numeros: " + enteros);
        }
        enteros.remove(1);
        System.out.println(enteros);
        enteros.remove(2);
        System.out.println(enteros);
        enteros.remove(3);
        System.out.println(enteros);
        enteros.remove(4);
        System.out.println(enteros);
        enteros.remove(5);
        System.out.println(enteros);

        for (int i :
                enteros) {
            System.out.println("numeros finales: " + enteros);
        }
        // Ejercicio 6, segunda forma
        ArrayList<Integer> enteros2 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                enteros2.add(i);
            }
            System.out.println("numeros enteros: " + enteros2);
        }

        //ejercicio7

        try {
            dividePorZero();
            System.out.println("demo de codigo");
        } catch (ArithmeticException e) {
            System.out.println("esto no puede hacerse");
        }

    }
    //ejercicio7
    public static void dividePorZero() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese dos numeros: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();
        int resultado = numeroA / numeroB;

        try {
            resultado = numeroA / numeroB;
        }catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
