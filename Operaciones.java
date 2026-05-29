import java.util.Scanner;

public class Operaciones {
    private int valor1;
    private int valor2;

    public Operaciones() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer valor entero: ");
        valor1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor entero: ");
        valor2 = sc.nextInt();
    }

    public void sumar() { System.out.println("Suma: " + (valor1 + valor2)); }
    public void restar() { System.out.println("Resta: " + (valor1 - valor2)); }
    public void multiplicar() { System.out.println("Multiplicación: " + (valor1 * valor2)); }
    public void dividir() {
        if (valor2 != 0) System.out.println("División: " + ((double) valor1 / valor2));
        else System.out.println("No se puede dividir entre cero.");
    }

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
    }
}
