//importamos las librerias correspondientes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registro de Eventos - Universidad Albert Einstein");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        JPanel mainPanel = new JPanel(new GridLayout(9, 2, 15, 15));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

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

        //agregamos los componentes al formulario
        mainPanel.add(nombreLabel);
        mainPanel.add(nombreText);
        mainPanel.add(correoLabel);
        mainPanel.add(correoText);
        mainPanel.add(telefonoLabel);
        mainPanel.add(telefonoText);
        mainPanel.add(new JLabel("Eventos a los que asistira"));
        mainPanel.add(eventoComboBox);
        mainPanel.add(eventoComboBox);
        mainPanel.add(new JLabel("Preferencia de comida:"));
        mainPanel.add(comidaComboBox);
        mainPanel.add(comidaComboBox);
        mainPanel.add(accesibilidadCheckBox);
        mainPanel.add(traduccionCheckBox);
        mainPanel.add(new JLabel("Genero"));
        JPanel generoPanel = new JPanel(new FlowLayout());
        generoPanel.add(femeninoRadioButton);
        generoPanel.add(masculinoRadioButton);
        mainPanel.add(generoPanel);
        mainPanel.add(submitButton);

        //manejo del evento del boton de envio
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreText.getText();
                String correo = correoText.getText();
                String telefono = telefonoText.getText();
                String evento = eventoComboBox.getSelectedItem().toString();
                String comida = comidaComboBox.getSelectedItem().toString();
                String genero = femeninoRadioButton.isSelected() ? "Femenino" : "Masculino";

                StringBuilder requerimientos = new StringBuilder("Requerimientos especiales: ");
                if (accesibilidadCheckBox.isSelected()) {
                    requerimientos.append("Accesibilidad para discapacitados \n ");
                }
                if (traduccionCheckBox.isSelected()) {
                    requerimientos.append("Requiero traducción ");
                }
                if (!accesibilidadCheckBox.isSelected() && !traduccionCheckBox.isSelected()) {
                    requerimientos.append("Ninguna preferencia ");
                }

                //mostrar en consola
                System.out.println("**********************************************");
                System.out.println("Nombres: " + nombre);
                System.out.println("Coreo electrónico: " + correo);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Evento al cuál asistirá: " + evento);
                System.out.println("Preferencia de comida: " + comida);
                System.out.println("Genero: " + genero);
                System.out.println(requerimientos.toString());
                System.out.println("**********************************************");

            }
        });


        frame.add(mainPanel);
        frame.setVisible(true);
    }
}