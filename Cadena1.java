import java.util.Scanner;

public class Cadena1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la primer cadena: ");
        String cad1 = teclado.nextLine();
        System.out.print("Ingrese la segunda cadena: ");
        String cad2 = teclado.nextLine();

        if (cad1.equals(cad2)) System.out.println(cad1 + " es exactamente igual a " + cad2);
        else System.out.println(cad1 + " no es exactamente igual a " + cad2);

        if (cad1.equalsIgnoreCase(cad2)) System.out.println(cad1 + " es igual a " + cad2 + " sin tener en cuenta mayúsculas/minúsculas");
        else System.out.println(cad1 + " no es igual a " + cad2 + " sin tener en cuenta mayúsculas/minúsculas");

        int comparacion = cad1.compareTo(cad2);
        if (comparacion == 0) System.out.println(cad1 + " es exactamente igual a " + cad2);
        else if (comparacion > 0) System.out.println(cad1 + " es mayor alfabéticamente que " + cad2);
        else System.out.println(cad2 + " es mayor alfabéticamente que " + cad1);

        if (!cad1.isEmpty()) {
            System.out.println("El primer caracter de " + cad1 + " es " + cad1.charAt(0));
            System.out.println("El largo del String " + cad1 + " es " + cad1.length());
            int fin = Math.min(3, cad1.length());
            System.out.println("Los primeros caracteres de " + cad1 + " son " + cad1.substring(0, fin));
            int posi = cad1.indexOf(cad2);
            if (posi == -1) System.out.println(cad2 + " no está contenido en " + cad1);
            else System.out.println(cad2 + " está contenido en " + cad1 + " a partir de la posición " + posi);
            System.out.println(cad1 + " convertido a mayúsculas es " + cad1.toUpperCase());
            System.out.println(cad1 + " convertido a minúsculas es " + cad1.toLowerCase());
        }
    }
}
