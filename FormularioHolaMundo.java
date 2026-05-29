import javax.swing.*;

public class FormularioHolaMundo extends JFrame {
    private JLabel label1;

    public FormularioHolaMundo() {
        setLayout(null);
        label1 = new JLabel("Hola Mundo.");
        label1.setBounds(10, 20, 200, 30);
        add(label1);
    }

    public static void main(String[] args) {
        FormularioHolaMundo formulario1 = new FormularioHolaMundo();
        formulario1.setBounds(10, 10, 400, 300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
