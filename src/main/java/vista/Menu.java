package vista;

import controlador.ControladorVista;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.w3c.dom.css.RGBColor;

public class Menu extends JFrame implements ActionListener {

    //atributos
    JLabel lblImagen, lblTitulo, lblPersonas, lblPisos, lblGrupo;
    ImageIcon img;
    JTextField jtfPersonas, jtfPisos;
    JButton btnCrear;

    ControladorVista c;
    ArrayList personas, pisos;

    //constructor
    public Menu() {
        this.setTitle("Inicio");
        this.setBounds(0, 0, 350, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(183, 193, 190));
        crearComponentes();
        this.setVisible(true);
    }

    public void crearComponentes() {
        //label Titulo 
        lblTitulo = new JLabel("DOMOHOUSE");
        lblTitulo.setBounds(50, 20, 250, 40);
        lblTitulo.setForeground(new Color(28, 182, 135));
        lblTitulo.setFont(new Font("Times New Roman", 1, 35));
        add(lblTitulo);

        //ImageIcon
        img = new ImageIcon("src/main/java/imagenes/domotica.jpg");
        lblImagen = new JLabel(img);
        lblImagen.setBounds(7, 70, 320, 185);
        add(lblImagen);

        //label Personas
        lblPersonas = new JLabel("Ingrese el número de personas: ");
        lblPersonas.setBounds(39, 300, 300, 30);
        lblPersonas.setFont(new Font("Times New Roman", 1, 20));
        add(lblPersonas);

        //input Personas
        jtfPersonas = new JTextField();
        jtfPersonas.setBounds(39, 330, 253, 30);
        add(jtfPersonas);

        //boton
        btnCrear = new JButton("Crear");
        btnCrear.setBounds(120, 395, 85, 30);
        btnCrear.setBackground(Color.WHITE);
        btnCrear.setForeground(Color.BLACK);
        btnCrear.setFont(new Font("Times New Roman", 1, 15));
        btnCrear.addActionListener(this);
        btnCrear.setActionCommand("crear");
        add(btnCrear);

        //label Grupo
        lblGrupo = new JLabel("© Grupo 3");
        lblGrupo.setBounds(10, 430, 100, 30);
        lblGrupo.setFont(new Font("Times New Roman", 1, 20));
        add(lblGrupo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "crear") {
            
            int cantidad = Integer.parseInt(jtfPersonas.getText());
            if (cantidad > 0 && cantidad < 4) {
                this.setVisible(false);
                c = new ControladorVista();
                try {
                    c.crearVistaPrincipal(cantidad);
                } catch (Exception ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else{
                JOptionPane.showMessageDialog(null, "Ingrese una opción entre 1 y 3");
            }

        }
    }
}
