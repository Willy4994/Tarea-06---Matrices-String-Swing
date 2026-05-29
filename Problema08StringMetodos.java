import java.util.Scanner;

public class Problema08StringMetodos {
    private String cadena;

    public Problema08StringMetodos(String cadena) {
        this.cadena = cadena;
    }

    public void imprimirPrimeraMitad() {
        System.out.println("Primera mitad: " + cadena.substring(0, cadena.length() / 2));
    }

    public void imprimirUltimoCaracter() {
        if (!cadena.isEmpty()) System.out.println("Último caracter: " + cadena.charAt(cadena.length() - 1));
    }

    public void imprimirInversa() {
        System.out.print("Cadena inversa: ");
        for (int i = cadena.length() - 1; i >= 0; i--) System.out.print(cadena.charAt(i));
        System.out.println();
    }

    public void imprimirConGuion() {
        System.out.print("Separada con guión: ");
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
            if (i < cadena.length() - 1) System.out.print("-");
        }
        System.out.println();
    }

    public void contarVocales() {
        int contador = 0;
        String minuscula = cadena.toLowerCase();
        for (int i = 0; i < minuscula.length(); i++) {
            char c = minuscula.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') contador++;
        }
        System.out.println("Cantidad de vocales: " + contador);
    }

    public void verificarPalindromo() {
        String normal = cadena.replace(" ", "").toLowerCase();
        String inversa = new StringBuilder(normal).reverse().toString();
        if (normal.equals(inversa)) System.out.println("La cadena se lee igual en ambas direcciones.");
        else System.out.println("La cadena no se lee igual en ambas direcciones.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        Problema08StringMetodos obj = new Problema08StringMetodos(sc.nextLine());
        obj.imprimirPrimeraMitad();
        obj.imprimirUltimoCaracter();
        obj.imprimirInversa();
        obj.imprimirConGuion();
        obj.contarVocales();
        obj.verificarPalindromo();
    }
}
