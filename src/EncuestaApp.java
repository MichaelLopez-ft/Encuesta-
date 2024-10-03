import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncuestaApp extends JFrame {
    private Encuesta encuestaActual;
    private int preguntaActual = 0;
    private JLabel labelPregunta;
    private JButton buttonSi;
    private JButton buttonNo;

    public EncuestaApp(Encuesta encuesta) {
        this.encuestaActual = encuesta;
        setTitle(encuesta.getTitulo());
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        labelPregunta = new JLabel(encuesta.getPreguntas().get(preguntaActual));
        buttonSi = new JButton("Sí");
        buttonNo = new JButton("No");

        JPanel panelBotones = new JPanel();
        panelBotones.add(buttonSi);
        panelBotones.add(buttonNo);

        add(labelPregunta, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);

        buttonSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarRespuesta("Sí");
            }
        });

        buttonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarRespuesta("No");
            }
        });
    }

    private void procesarRespuesta(String respuesta) {
        encuestaActual.guardarRespuesta(respuesta);
        preguntaActual++;

        if (preguntaActual < encuestaActual.getPreguntas().size()) {
            labelPregunta.setText(encuestaActual.getPreguntas().get(preguntaActual));
        } else {
            mostrarMensajeFinal();
        }
    }

    private void mostrarMensajeFinal() {
        JOptionPane.showMessageDialog(this, "Gracias por completar la encuesta.");
        System.exit(0);
    }
}
