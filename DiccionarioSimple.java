

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

	        // Solicitar que ingrese una palabra en ingl�s
	        String palabraIngles = JOptionPane.showInputDialog("Ingrese una palabra en ingl�s:");

	        // Convertir a min�sculas 
	        palabraIngles = palabraIngles.toLowerCase();

	        // Buscar la traducci�n en el diccionario
	        String traduccion = diccionario.get(palabraIngles);

	        // Mostrar la traducci�n
	        if (traduccion != null) {
	            JOptionPane.showMessageDialog(null, "Traducci�n al espa�ol: " + traduccion);
	        } else {
	            JOptionPane.showMessageDialog(null, "La palabra no est� en el diccionario.");
	        }
	    }
	}


