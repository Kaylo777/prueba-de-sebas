package EvaluacionMoreno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class EvaluacionMoreno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<Integer> lega = new ArrayList<>();
		List<String> apellidos = new ArrayList<>();
		List<String> nombre = new ArrayList<>();
		
		
		System.out.println("Cuantas personas registrara?");
		int cantidadPersonas = entrada.nextInt();

	
		for (int i = 0; i < cantidadPersonas; i++) {
			//  la lista de lega.
			System.out.println("Ingrese un numero de legajo : ");
			int numeroLegajo = entrada.nextInt();
		
		
		while(numeroLegajo <= 10000 && numeroLegajo >= 99999) {
			System.err.println("ERROR los numeros no son correctos \n");
			System.out.println("Ingrese nuevamente el numero de legajo.");
			numeroLegajo = entrada.nextInt();
		}
		lega.add(numeroLegajo);
			//  la lista de apellidos.
			System.out.println("ahora ingrese el apellido del legajo  " + (i + 1) + ":");
			apellidos.add(entrada.next());
			// la lista de nombres
			System.out.println("ahora ingrese el bello nombre del legajo  " + (i + 1) + ":");
			nombre.add(entrada.next());
		}
		
		for (int i = 0; i < lega.size() - 1; i++) {
		    for (int j = 0; j < lega.size() - i - 1; j++) {
		        if (lega.get(j) > lega.get(j + 1)) {
		            // Intercambiar elementos
		            int temp = lega.get(j);
		            lega.set(j, lega.get(j + 1));
		            lega.set(j + 1, temp);
		        }
		    }
		}
		System.out.println("su lista de legajos quedo asi: \n" + lega);
		System.out.println("y la lista de apellidos quedo asi: \n " + apellidos);
		System.out.println("y asi la de nombres: \n " + nombre);
	}

}
