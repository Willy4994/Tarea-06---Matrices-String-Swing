import java.util.Scanner;

public class Problema05MatrizPorColumnas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][5];
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.print("Ingrese valor para fila " + f + ", columna " + c + ": ");
                matriz[f][c] = sc.nextInt();
            }
        }
        System.out.println("Matriz ingresada:");
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) System.out.print(matriz[f][c] + " ");
            System.out.println();
        }
    }
}
