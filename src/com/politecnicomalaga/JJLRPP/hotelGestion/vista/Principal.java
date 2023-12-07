package com.politecnicomalaga.JJLRPP.hotelGestion.vista;

public class Principal {
    
	public static void main(String[] args) {
		
		 /*Hotel de la costa del sol

     MENU:

     - Mostrar una lista de todos los clientes por pantalla.
     - Crear un cliente nuevo.
     - Eliminar un cliente existente
     - Crear una promoción para los clientes de edades entre un mínimo y un máximo de edad*/
     
     //ESCANER PEDIR DATOS
     //private Controlador trabajador;
 	
		boolean seguir = true;
		String respuesta ;
		Scanner sc = new Scanner(System.in);
		
		while(seguir) {
			
			System.out.println("  --------------------------");
			System.out.println(" |Hotel de la costa del sol |");
			System.out.println("  --------------------------");
			System.out.println("");
			System.out.println("a: Mostrar una lista de todos los clientes por pantalla");
			System.out.println("b: Crear un cliente nuevo");
			System.out.println("c: Eliminar un cliente existente");
			System.out.println("d: Crear una promoción para los clientes de edades entre un mínimo y un máximo de edad");
			System.out.println("(cualquier otro): Salir ");
			
			respuesta = sc.nextLine();
			
			
			
//programa a ----------------------------------------------------------------------------------------------------------------------
			
			boolean seguir2 = true;
			
			if (respuesta.compareTo("a") == 0) {
				
	

				System.out.println("Pulsa intro para volver al menu...");
				respuesta = sc.nextLine();
				
				
				
//programa b ------------------------------------------------------------------------------------------------------------------------------				
			}else if(respuesta.compareTo("b") == 0) {
				
					

				
				System.out.println("Pulsa intro para volver al menu...");
				respuesta = sc.nextLine();
				
				
//programa c ------------------------------------------------------------------------------------------------------------------------------				
				

			}else if(respuesta.compareTo("c") == 0) {
					
				
				
				System.out.println("Pulsa intro para volver al menu...");
				respuesta = sc.nextLine();
				
				
//salir	---------------------------------------------------------------------------------------------------------------------------------
			}else if(respuesta.compareTo("d") == 0) {
				
				
				
			System.out.println("Pulsa intro para volver al menu...");
			respuesta = sc.nextLine();
			
			
//salir	---------------------------------------------------------------------------------------------------------------------------------
			}else {
					
					seguir = false;
					
				}
				
			}	
     
}
    
}