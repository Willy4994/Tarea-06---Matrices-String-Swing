import java.util.Scanner;

public class Problema09PersonasMail {
    private String[] nombres = new String[5];
    private String[] mails = new String[5];
    private Scanner sc = new Scanner(System.in);

    public void cargar() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre de la persona " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese mail: ");
            mails[i] = sc.nextLine();
        }
    }

    public void mostrarDatos() {
        System.out.println("Datos ingresados:");
        for (int i = 0; i < 5; i++) System.out.println(nombres[i] + " - " + mails[i]);
    }

    public void consultarMail() {
        System.out.print("Ingrese nombre a consultar: ");
        String nombreBuscado = sc.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Mail de " + nombres[i] + ": " + mails[i]);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nombre no encontrado.");
    }

    public void mostrarMailsSinArroba() {
        System.out.println("Mails que no tienen @:");
        for (int i = 0; i < 5; i++) {
            if (mails[i].indexOf('@') == -1) System.out.println(nombres[i] + " - " + mails[i]);
        }
    }

    public static void main(String[] args) {
        Problema09PersonasMail obj = new Problema09PersonasMail();
        obj.cargar();
        obj.mostrarDatos();
        obj.consultarMail();
        obj.mostrarMailsSinArroba();
    }
}
