import java.util.HashMap;
import javax.swing.JOptionPane;

public class RegistroNotasEstudiantes {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los nombres de los estudiantes y sus notas
        HashMap<String, Double> registroNotas = new HashMap<>();

        int opcion;

        do {
            String[] opciones = {"Agregar estudiante y nota", "Consultar nota de estudiante", "Salir"};
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0:
                    // Agregar estudiante y nota
                    String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                    double notaEstudiante = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante:"));
                    registroNotas.put(nombreEstudiante, notaEstudiante);
                    break;
                case 1:
                    // Consultar nota de estudiante
                    String nombreConsulta = JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar:");
                    Double notaConsulta = registroNotas.get(nombreConsulta);
                    if (notaConsulta != null) {
                        JOptionPane.showMessageDialog(null, "La nota de " + nombreConsulta + " es: " + notaConsulta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
                    }
                    break;
                case 2:
                    // Salir
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 2);
    }
}

