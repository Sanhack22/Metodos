
	import javax.swing.JOptionPane;
	import java.util.ArrayList;
	import java.util.Iterator;

	import javax.swing.JOptionPane;

	public class segundo {
		
		//Primer Ejercicio
			public void nombre() {
				
				String nombre = JOptionPane.showInputDialog("Ingresa Tu Nombre");
				String apellido = JOptionPane.showInputDialog("Ingresa Tu Apellido");
				System.out.println("Su nombre es: "+nombre+" "+apellido);
			}
			
		
		//Segundo Ejercicio
			public void numero (int num) {
				
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor que 10"));
				
				if (num<10) {
					
					System.out.println("El numero Ingresado es menor de 10");
					
				}else {
					System.out.println("El numero Ingresado Si es Mayor de 10");
				}
			}
			
		//Tercer Ejercicio
			public int numeroAleatorio() {
			    int numero = (int) (Math.random() * 100);
			    return numero;
			}
			
		//Cuarto Ejercicio
			public int Mayor(int[]arra) {
				
				int maximo=0;
				for (int j = 0; j < arra.length; j++) {
				
					if (arra[j]>maximo) {
						maximo=arra[j];
					}
				}
				return maximo;
				
			}
		//Quinto Ejercicio
			public int ArList(ArrayList<Integer> listaEnteros) {
				listaEnteros.add(20);
				listaEnteros.add(10);
				listaEnteros.add(60);
				int maximo=0;

				for (int i = 0; i < listaEnteros.size(); i++) {
					
					if (listaEnteros.get(i)>maximo) {
						maximo=listaEnteros.get(i);
					}
					
				}
				return maximo;
				
			}
			
		}


