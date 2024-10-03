import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Encuesta encuesta1 = new Encuesta("Encuesta 1: Salud", Arrays.asList(
                "¿Haces ejercicio regularmente?",
                "¿Duermes al menos 8 horas al día?",
                "¿Fumas?",
                "¿Consumes alcohol?",
                "¿Te sientes estresado frecuentemente?"
        ));
        Encuesta encuesta2 = new Encuesta("Encuesta 2: Alimentación", Arrays.asList(
                "¿Haces más de 3 comidas al día?",
                "¿Consumes alimentos procesados?",
                "¿Comes frutas y verduras diariamente?",
                "¿Bebes al menos 2 litros de agua al día?",
                "¿Tienes alguna alergia alimentaria?"
        ));

        JFrame frame = new JFrame("Selecciona una Encuesta");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JButton buttonEncuesta1 = new JButton("Encuesta 1: Salud");
        JButton buttonEncuesta2 = new JButton("Encuesta 2: Alimentación");

        frame.add(buttonEncuesta1);
        frame.add(buttonEncuesta2);

        buttonEncuesta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EncuestaApp(encuesta1).setVisible(true);
                frame.dispose(); // Cerrar la ventana de selección
            }
        });

        buttonEncuesta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EncuestaApp(encuesta2).setVisible(true);
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}


