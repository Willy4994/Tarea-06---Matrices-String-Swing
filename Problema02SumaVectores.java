import java.util.Scanner;

public class Problema02SumaVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        int[] suma = new int[4];
        System.out.println("Carga del primer vector");
        for (int i = 0; i < 4; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector1[i] = sc.nextInt();
        }
        System.out.println("Carga del segundo vector");
        for (int i = 0; i < 4; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector2[i] = sc.nextInt();
        }
        System.out.println("Vector suma:");
        for (int i = 0; i < 4; i++) {
            suma[i] = vector1[i] + vector2[i];
            System.out.print(suma[i] + " ");
        }
        System.out.println();
    }
}
