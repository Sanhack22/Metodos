

	import java.util.HashMap;
	import javax.swing.JOptionPane;

	public class DiccionarioSimple {
	    public static void main(String[] args) {
	        // Crear un HashMap para almacenar las palabras y sus traducciones
	        HashMap<String, String> diccionario = new HashMap<>();

	        // Agregar algunas palabras al diccionario
	        diccionario.put("hello", "hola");
	        diccionario.put("apple", "manzana");
	        diccionario.put("cat", "gato");
	        diccionario.put("dog", "perro");
	        diccionario.put("house", "casa");

	        // Solicitar que ingrese una palabra en inglés
	        String palabraIngles = JOptionPane.showInputDialog("Ingrese una palabra en inglés:");

	        // Convertir a minúsculas 
	        palabraIngles = palabraIngles.toLowerCase();

	        // Buscar la traducción en el diccionario
	        String traduccion = diccionario.get(palabraIngles);

	        // Mostrar la traducción
	        if (traduccion != null) {
	            JOptionPane.showMessageDialog(null, "Traducción al español: " + traduccion);
	        } else {
	            JOptionPane.showMessageDialog(null, "La palabra no está en el diccionario.");
	        }
	    }
	}


