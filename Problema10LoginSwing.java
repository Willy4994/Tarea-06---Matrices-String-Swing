import javax.swing.*;
import java.awt.event.*;

public class Problema10LoginSwing extends JFrame implements ActionListener {
    private JTextField txtUsuario;
    private JPasswordField txtClave;
    private JButton btnIngresar;
    private JLabel lblUsuario, lblClave;

    public Problema10LoginSwing() {
        setLayout(null);
        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(10, 10, 100, 25);
        add(lblUsuario);
        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 10, 150, 25);
        add(txtUsuario);
        lblClave = new JLabel("Clave:");
        lblClave.setBounds(10, 45, 100, 25);
        add(lblClave);
        txtClave = new JPasswordField();
        txtClave.setBounds(120, 45, 150, 25);
        add(txtClave);
        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(10, 90, 120, 30);
        add(btnIngresar);
        btnIngresar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIngresar) {
            String usuario = txtUsuario.getText();
            String clave = new String(txtClave.getPassword());
            if (usuario.equals("juan") && clave.equals("abc123")) setTitle("Correcto");
            else setTitle("Incorrecto");
        }
    }

    public static void main(String[] args) {
        Problema10LoginSwing formulario = new Problema10LoginSwing();
        formulario.setBounds(0, 0, 320, 180);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
