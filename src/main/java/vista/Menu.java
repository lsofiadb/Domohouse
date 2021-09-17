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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.w3c.dom.css.RGBColor;

public class Menu extends JFrame implements ActionListener{
    
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
        this.getContentPane().setBackground(new Color(183, 193, 190 ));
        crearComponentes();
    }
    
    public void crearComponentes(){
        //label Titulo 
        lblTitulo=new JLabel("DOMOHOUSE");
        lblTitulo.setBounds(50, 20, 250, 40);
        lblTitulo.setForeground(new Color(28, 182, 135));
        lblTitulo.setFont(new Font("Times New Roman",1,35));
        add(lblTitulo);
        
        //ImageIcon
        img=new ImageIcon("src/main/java/imagenes/domotica.jpg");
        lblImagen=new JLabel(img);
        lblImagen.setBounds(7, 70, 320, 185);
        add(lblImagen);
        
        //label Personas
        lblPersonas = new JLabel("Ingrese el número de personas: ");
        lblPersonas.setBounds(39, 260, 300, 30);
        lblPersonas.setFont(new Font("Times New Roman",1,20));
        add(lblPersonas);
        
        //input Personas
        jtfPersonas = new JTextField();
        jtfPersonas.setBounds(39, 290, 253, 30);
        add(jtfPersonas);
        
        //label Pisos
        lblPisos = new JLabel("Ingrese el número de pisos: ");
        lblPisos.setBounds(39, 320, 300, 30);
        lblPisos.setFont(new Font("Times New Roman",1,20));
        add(lblPisos);
        
        //input Pisos
        jtfPisos = new JTextField();
        jtfPisos.setBounds(39, 350, 253, 30);
        add(jtfPisos);
        
        //boton
        btnCrear = new JButton("Crear");
        btnCrear.setBounds(120, 395, 85, 30);
        btnCrear.setBackground(Color.WHITE);
        btnCrear.setForeground(Color.BLACK);
        btnCrear.setFont(new Font("Times New Roman",1,15));
        btnCrear.addActionListener(this);
        btnCrear.setActionCommand("crear");
        add(btnCrear);
        
        //label Grupo
        lblGrupo = new JLabel("© Grupo 3");
        lblGrupo.setBounds(10, 430, 100, 30);
        lblGrupo.setFont(new Font("Times New Roman",1,20));
        add(lblGrupo);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="crear"){
            this.setVisible(false);
            //pendiente 
//            c.crearVistaPrincipal(personas, pisos);
            c = new ControladorVista();
            c.temporal();
        }
    }
}