import java.util.Scanner;

public class Problema03PromedioCursos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] cursoA = new double[5];
        double[] cursoB = new double[5];
        double sumaA = 0, sumaB = 0;
        System.out.println("Notas del curso A");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            cursoA[i] = sc.nextDouble();
            sumaA += cursoA[i];
        }
        System.out.println("Notas del curso B");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            cursoB[i] = sc.nextDouble();
            sumaB += cursoB[i];
        }
        double promedioA = sumaA / 5;
        double promedioB = sumaB / 5;
        System.out.println("Promedio curso A: " + promedioA);
        System.out.println("Promedio curso B: " + promedioB);
        if (promedioA > promedioB) System.out.println("El curso A obtuvo mayor promedio general.");
        else if (promedioB > promedioA) System.out.println("El curso B obtuvo mayor promedio general.");
        else System.out.println("Ambos cursos obtuvieron el mismo promedio general.");
    }
}
