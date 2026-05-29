import javax.swing.*;

public class HolaSwing {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi App en Swing");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton boton = new JButton("¡Haz clic aquí!");
        boton.addActionListener(e -> JOptionPane.showMessageDialog(ventana, "¡Hola desde Swing!"));
        ventana.add(boton);
        ventana.setVisible(true);
    }
}
