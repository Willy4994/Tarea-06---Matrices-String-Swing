import java.util.Scanner;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese sueldo: ");
        sueldo = sc.nextDouble();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    public void verificarImpuestos() {
        if (sueldo > 3000) System.out.println("Debe pagar impuestos.");
        else System.out.println("No debe pagar impuestos.");
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.imprimirDatos();
        empleado.verificarImpuestos();
    }
}
