import javax.swing.*;
import java.awt.event.*;

public class FormularioSumaTitulo extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JLabel label1, label2;
    private JButton boton1;

    public FormularioSumaTitulo() {
        setLayout(null);
        label1 = new JLabel("Número 1:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        textfield1 = new JTextField();
        textfield1.setBounds(120, 10, 150, 20);
        add(textfield1);
        label2 = new JLabel("Número 2:");
        label2.setBounds(10, 40, 100, 30);
        add(label2);
        textfield2 = new JTextField();
        textfield2.setBounds(120, 40, 150, 20);
        add(textfield2);
        boton1 = new JButton("Sumar");
        boton1.setBounds(10, 90, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            int x1 = Integer.parseInt(textfield1.getText());
            int x2 = Integer.parseInt(textfield2.getText());
            setTitle(String.valueOf(x1 + x2));
        }
    }

    public static void main(String[] args) {
        FormularioSumaTitulo formulario1 = new FormularioSumaTitulo();
        formulario1.setBounds(0, 0, 350, 180);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
