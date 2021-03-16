import java.util.Scanner;

public class Cabecera {
	
	static int contadorRomantico = 0;

	static int contadorCoqueteo = 0;

	static int contadorInteligente = 0;

	static int contadorSalido = 0;


	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean ejecucion = true;
		
		while(ejecucion == true) {
			
			System.out.println("\n\t\t\t\t\t\t\t\tBIENVENIDO AL SIMULADOR DE CITAS :\n\n\t\t\t\t\t\t\t\t\t[1] Para Jugar.\n\t\t\t\t\t\t\t\t\t"
					+ "[2] Cerrar aplicacion.");
			
			System.out.print("\n\n\t\t\t\t\t\t\t\t\tHAGA SU ELECCION : ");
			
			String ejecutar = scanner.nextLine();
				
			if ( ejecutar.equals("1")) {
				
				cabecera();
				
				System.out.print("\n\t\t\t\t\t\t\t\tHAGA SU ELECCION : ");
				
				ejecutar = scanner.nextLine();
				
				if (ejecutar.equals("1")) {
					
					maria();
				}
				
				
			}
			
			else if ( ejecutar.equals("2")) {
				
			System.out.println("Gracias por utilizar el programa");
			
			ejecucion = false;
			
			}
			
			else {
				
				System.out.println("opcion no disponible. Introduzca una correcta.");
			}
			
			
		}

	}

	
	static void cabecera() {
		
		System.out.println("\tJava?Jav");
		System.out.println("       ?Java?Java");
		System.out.println("      J?Java?Java?");
		System.out.println("      ?Java?Java?J");
		System.out.println("      ?Java?Java?J");
		System.out.println("     ?Java?Java?Ja");
		System.out.println("    ?Java?Java?Ja");
		System.out.println("    ?Java?Java?Ja");
		System.out.println("    ?Java?Java?Java?");
		System.out.println("   ?Java?Java?Java?Java");
		System.out.println("   ?Java?Java?Java?Java?Ja");
		System.out.println("   ?Java?Java?Java?Java?Jav"); 
		System.out.println("    ?Java?  ?Java?Java?Jav\t\t\t\t\tESCOJA LA CHICA CON LA QUE QUIERE TENER LA CITA :");
		System.out.println("      ?Jav    ?Java?Java?");
		System.out.println("      ?Jav     ?Java?Java\t\t\t\t\t\t[1] Charo.");
		System.out.println("      ?Jav     ?Java?Java\t\t\t\t\t\t[2] Estefania.");
		System.out.println("       ?Jav    ?Java?Java\t\t\t\t\t\t[3] Zenobia. ");
		System.out.println("        ?Jav    ?Java?Jav");
		System.out.println("         ?Jav  ?Java?Java");
		System.out.println("          ?Java?Java?Jav");
		System.out.println("           ?Java?Java?Jav");
		System.out.println("          ?Java?Java?Java?Ja");
		System.out.println("          ?Java?Java?Java?Java?");
		System.out.println("          ?Java?Java?Java?Java?Java");
		System.out.println("          ?Java?Java?Java?Java?Java?J");
		System.out.println("           ?Java?Java    ?Java?Java?Ja");
		System.out.println("           ?Java?Ja        ?Java?Java?");
		System.out.println("           ?Java?Ja      ?Java?Java?");
		System.out.println("           ?Java?J     ?Java?Java");
		System.out.println("           ?Java?J  ?Java?Java");
		System.out.println("          ?Java?Java?Java");
		System.out.println("          ?Java?Java?J");
		System.out.println("          ?Java?Java");
		System.out.println("         ?Java?Ja");
		System.out.println("         ?Java?");
		System.out.println("        ?Java?");
		System.out.println("        ?Java?");
		System.out.println("        ?Java?");
		System.out.println("        ?Java");
		System.out.println("        ?Java");
		System.out.println("         ?Jav");
		System.out.println("         ?Jav");
		System.out.println("         ?Jav");
		System.out.println("        ?Java");
		System.out.println("        ?Java");
		System.out.println("         Java");
		System.out.println("          Java?");
		System.out.println("           JavA");
	
	}
	
	
	static void maria() {
		
		bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
		
		
		if (contadorCoqueteo > 5 && contadorRomantico == 3) {
			
			System.out.println("la cita ha sido muy interesante has obtenido un 8/10 .");
		}
		
		
	}
}


