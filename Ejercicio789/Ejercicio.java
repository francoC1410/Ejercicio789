package Ejercicio789;

public class Ejercicio {
        public static void main(String[] args) {
            String str = "hola mundo";
            System.out.println(str);
            StringBuilder strb = new StringBuilder(str);
            str = strb.reverse().toString();
            System.out.println(str);
        }

}




