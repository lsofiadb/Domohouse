package vista;

import controlador.ControladorPersona;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelo.NodoHabitacion;

public class VistaPrincipal extends JFrame implements ActionListener, Runnable {

    //atributos
    private ArrayList personas, pisos;
    JPanel panel1, panel2, panel3;
    JButton btn1, btn2, btn3, btnBajar;
    JLabel lblp1, lblp2, lblp3, lblPersona1, lblPersona2, lblPersona3;
    ImageIcon imgp1, imgp2, imgp3, imgper1, imgper2, imgper3;

    public VistaPrincipal() throws Exception {
        this.setTitle("Domohouse");
        this.setBounds(0, 0, 1100, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearComponentes();
        this.setVisible(true);

    }

    public void setPersonas(ArrayList personas) {
        personas = this.personas;
    }

    public void setPisos(ArrayList pisos) {
        pisos = this.pisos;
    }

    public void crearComponentes() throws Exception {
        //escoger un jpanel
        crearPanel1();
        crearPanel2();
        crearPanel3();

    }

    public void crearPanel1() throws Exception {
        //Panel
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 1100, 800);
        panel1.setBackground(new Color(183, 193, 190));
        panel1.setLayout(null);

        //labels personas
        imgper1 = new ImageIcon("src/main/java/imagenes/persona1.png");
        lblPersona1 = new JLabel(imgper1);
        lblPersona1.setBounds(485, 190, 40, 40);
        panel1.add(lblPersona1);

        //Image con el piso
        imgp1 = new ImageIcon("src/main/java/imagenes/PISO1.PNG");
        lblp1 = new JLabel(imgp1);
        lblp1.setBounds(170, 10, 730, 561);
        panel1.add(lblp1);

        //Boton subir a piso 2
        btn1 = new JButton("Subir al piso 2");
        btn1.setBounds(930, 300, 130, 30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", 1, 15));
        btn1.addActionListener(this);
        panel1.add(btn1);

        //JtextArea
        JTextArea txt1 = new JTextArea();
        txt1.append("Piso actual: \n");
        txt1.append("Cantidad de personas: \n");
        txt1.append("Cantidad de pisos: \n");
        txt1.setBounds(170, 600, 200, 55);
        panel1.add(txt1);

        this.add(panel1);
        panel1.setVisible(true);
        //actualizarPosicionPersona(lblPersona1);

        //this.getContentPane().setComponentZOrder(lblPersona1, 0);
    }

    //cambio de posicion de la imagen 
    public void actualizarPosicionPersona(JLabel label) throws Exception {
        ControladorPersona c = new ControladorPersona();
        List<NodoHabitacion> ruta = new ArrayList();
        ruta = c.consultarRuta();

        //posicion nuevas 
        for (int i = 0; i < ruta.size(); i++) {
            lblPersona1.setBounds(ruta.get(i).getPosX(), ruta.get(i).getPosY(), 40, 40);

        }
    }

    public void crearPanel2() {
        //panel
        panel2 = new JPanel();
        panel2.setBounds(0, 0, 1100, 800);
        panel2.setBackground(new Color(183, 193, 190));
        panel2.setLayout(null);

        //Image con el piso
        imgp2 = new ImageIcon("src/main/java/imagenes/PISO2.PNG");
        lblp2 = new JLabel(imgp2);
        lblp2.setBounds(170, 10, 717, 547);
        panel2.add(lblp2);

        //Boton subir a piso 3
        btn2 = new JButton("Subir al piso 3");
        btn2.setBounds(930, 300, 130, 30);
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(Color.BLACK);
        btn2.setFont(new Font("Times New Roman", 1, 15));
        btn2.addActionListener(this);
        panel2.add(btn2);

        //Boton bajar a piso 1
        btnBajar = new JButton("Bajar al piso 1");
        btnBajar.setBounds(930, 350, 130, 30);
        btnBajar.setBackground(Color.WHITE);
        btnBajar.setForeground(Color.BLACK);
        btnBajar.setFont(new Font("Times New Roman", 1, 15));
        btnBajar.addActionListener(this);
        panel2.add(btnBajar);

        //JtextArea
        JTextArea txt1 = new JTextArea();
        txt1.append("Piso actual: \n");
        txt1.append("Cantidad de personas: \n");
        txt1.append("Cantidad de pisos: \n");
        txt1.setBounds(170, 600, 200, 55);
        panel2.add(txt1);

        //Add panel al frame
        this.add(panel2);
        panel2.setVisible(false);
    }

    public void crearPanel3() {
        //panel 
        panel3 = new JPanel();
        panel3.setBounds(0, 0, 1100, 800);
        panel3.setBackground(new Color(183, 193, 190));
        panel3.setLayout(null);

        //Image con el piso
        imgp3 = new ImageIcon("src/main/java/imagenes/PISO3.PNG");
        lblp3 = new JLabel(imgp3);
        lblp3.setBounds(75, 10, 936, 474);
        panel3.add(lblp3);

        //Boton bajar al piso 2
        btn3 = new JButton("Bajar al piso 2");
        btn3.setBounds(881, 520, 130, 30);
        btn3.setBackground(Color.WHITE);
        btn3.setForeground(Color.BLACK);
        btn3.setFont(new Font("Times New Roman", 1, 15));
        btn3.addActionListener(this);
        panel3.add(btn3);
        this.add(panel3);

        //JtextArea
        JTextArea txt1 = new JTextArea();
        txt1.append("Piso actual: \n");
        txt1.append("Cantidad de personas: \n");
        txt1.append("Cantidad de pisos: \n");
        txt1.setBounds(170, 520, 200, 55);
        panel3.add(txt1);

        panel3.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
//            panel1.setVisible(false);
//            panel2.setVisible(true);
            run();
        } else if (e.getSource() == btn2) {
            panel2.setVisible(false);
            panel3.setVisible(true);
        } else if (e.getSource() == btnBajar) {
            panel2.setVisible(false);
            panel1.setVisible(true);
        } else if (e.getSource() == btn3) {
            panel3.setVisible(false);
            panel2.setVisible(true);
        }
    }

    @Override
    public void run() {
        Thread mihilo = new Thread();
        ControladorPersona c = new ControladorPersona();
        List<NodoHabitacion> ruta = new ArrayList();
        try {
            ruta = c.consultarRuta();
        
         mihilo.start();
        //posicion nuevas 
        for (int i = 0; i < ruta.size(); i++) {
           
            lblPersona1.setBounds(ruta.get(i).getPosX(), ruta.get(i).getPosY(), 40, 40);
            
                Thread.sleep(2000);
            }} catch (InterruptedException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        mihilo.stop();
        }
        
    }


