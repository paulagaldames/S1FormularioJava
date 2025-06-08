//importamos las librerias correspondientes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registro de Eventos - Universidad Albert Einstein");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(9, 2, 10, 10));

        //etiquetas label
        JLabel nombreLabel = new JLabel("Nombre:");
        JLabel correoLabel = new JLabel("Correo:");
        JLabel telefonoLabel = new JLabel("Telefono:");

        //etiquetas de entrada textos
        JTextField nombreText = new JTextField();
        JTextField correoText = new JTextField();
        JTextField telefonoText = new JTextField();

        //listas desplegables
        String[] eventos = {"Charla de IA", "Taller de Ciberseguridad", "Presentación de Proyectos", "Networking Profesional"};
        JComboBox<String> eventoComboBox = new JComboBox<>(eventos);

        String[] comida = {"Ninguna preferencia", "Vegetariano", "Vegano", "Sin gluten"};
        JComboBox<String> comidaComboBox = new JComboBox<>(comida);

        // CheckBoxes
        JCheckBox accesibilidadCheckBox = new JCheckBox("Accesibilidad para discapacitados");
        JCheckBox traduccionCheckBox = new JCheckBox("Necesito traducción");

        //Radiobutton
        JRadioButton masculinoRadioButton = new JRadioButton("Masculino");
        JRadioButton femeninoRadioButton = new JRadioButton("Femenino");
        ButtonGroup generoGroup = new ButtonGroup();
        generoGroup.add(femeninoRadioButton);
        generoGroup.add(masculinoRadioButton);

        //boton de envio
        JButton submitButton = new JButton("Enviar");



    }
}