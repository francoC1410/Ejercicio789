package Ejercicio789;

import java.io.*;
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) throws InputMismatchException {

        Scanner DatosDelTrabajador = new Scanner(System.in);
        System.out.println(" ingrese sus datos ");
        System.out.print(" nombre: ");
        String nombre = DatosDelTrabajador.next();
        System.out.print(" apellido: ");
        String apellido = DatosDelTrabajador.next();
        System.out.print(" sexo: ");
        String sexo = DatosDelTrabajador.next();
        System.out.print(" edad: ");
        int edad = DatosDelTrabajador.nextInt();
        System.out.print(" documento: ");
        int documento = DatosDelTrabajador.nextInt();


        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add(nombre);
        lista1.add(apellido);
        lista1.add(sexo);
        System.out.println(lista1);

        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(edad);
        lista2.add(documento);
        System.out.println(lista2);




        HashMap<LinkedList<String>, LinkedList<Integer>> listaFinal = new HashMap<>();
        listaFinal.put(lista1, lista2);



        try {

            PrintStream ficheroFinal = new PrintStream("fichero1.txt");
            ficheroFinal.write(String.valueOf(listaFinal).getBytes());
            ficheroFinal.close();

        } catch (Exception e) {
            System.out.println("excepcion: " + e.getMessage());
        }
    }
}
