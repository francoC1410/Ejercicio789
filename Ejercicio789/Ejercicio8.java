package Ejercicio789;

import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:/Users/chuec/Documents/Software/installed-files2.txt");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("789.txt");
            out.write(datos);
            out.close();

        }catch (Exception e) {
            System.out.println("excepcion: " + e.getMessage());
        }
    }
}
