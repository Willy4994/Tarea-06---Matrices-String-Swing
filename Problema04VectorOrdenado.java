import java.util.Scanner;

public class Problema04VectorOrdenado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        boolean ordenado = true;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                ordenado = false;
                break;
            }
        }
        if (ordenado) System.out.println("El vector está ordenado de menor a mayor.");
        else System.out.println("El vector no está ordenado de menor a mayor.");
    }
}
