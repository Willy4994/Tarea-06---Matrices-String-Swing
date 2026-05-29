import java.util.Scanner;

public class Problema01VectorAnalisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[8];
        int acumulado = 0, acumuladoMayores36 = 0, cantidadMayores50 = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            acumulado += vector[i];
            if (vector[i] > 36) acumuladoMayores36 += vector[i];
            if (vector[i] > 50) cantidadMayores50++;
        }
        System.out.println("Valor acumulado de todos los elementos: " + acumulado);
        System.out.println("Valor acumulado de elementos mayores a 36: " + acumuladoMayores36);
        System.out.println("Cantidad de valores mayores a 50: " + cantidadMayores50);
    }
}
