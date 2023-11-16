package Ejercicio8_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel radio, volumen, superficie;
    private JTextField campoRadio;
    private JButton calcular;

    public VentanaEsfera(){
        inicio();
        setTitle("Esfera");
        setSize(280,200);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void inicio(){
        contenedor=getContentPane();
        contenedor.setLayout(null);
        radio=new JLabel();
        radio.setText("Radio (cms):");
        radio.setBounds(20,20,135,23);
        campoRadio=new JTextField();
        campoRadio.setBounds(100,20,135,23);

        calcular
    }
}
