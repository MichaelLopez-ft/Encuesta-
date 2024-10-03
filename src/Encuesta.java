import java.util.ArrayList;
import java.util.List;

public class Encuesta {
    private String titulo;
    private List<String> preguntas;
    private List<String> respuestas;

    public Encuesta(String titulo, List<String> preguntas) {
        this.titulo = titulo;
        this.preguntas = preguntas;
        this.respuestas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getPreguntas() {
        return preguntas;
    }

    public void guardarRespuesta(String respuesta) {
        respuestas.add(respuesta);
    }

    public List<String> getRespuestas() {
        return respuestas;
    }
}

